package modelo.implementacao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import modelo.dao.VendedorDAO;
import modelo.database.DataBase;
import modelo.database.DbException;
import modelo.entities.Departamento;
import modelo.entities.Vendedor;

public class VendedorDaoJDBC implements VendedorDAO {
  private ResultSet rs=null;
  int rowsAffected;
  private static Connection conn;

    public VendedorDaoJDBC(Connection conn) {
        this.conn=conn;
    }
    
    public VendedorDaoJDBC() {
    }

    @Override
    public void Incerindo(Vendedor obj) {
      // TODO Auto-generated method stub
      
    }
    
    @Override
    public void Update(Vendedor obj) {
      PreparedStatement st = null;
      try{
        st=conn.prepareStatement(
          "UPDATE seller "
          +"SET Name = ?, Email = ?, BirthDate = ?, BaseSalary = ?, DepartmentId = ?"
          +" WHERE Id = ? ");
       st.setString(1,obj.getNome());
       st.setString(2,obj.getEmail());
       st.setDate(3,obj.getBithDate());
       st.setDouble(4,obj.getSalario());
       st.setInt(5,obj.getDepartamento().getId());
       st.setInt(6, obj.getId());
      rowsAffected= st.executeUpdate();
        
      }
      catch(Exception e){
        throw new DbException("[ERRO]"+e.getMessage());
      }
      finally{
        DataBase.closeStatement(st);
        DataBase.closeResultSet(rs);
      }
    }

    @Override
    public void DeleteId(Integer id) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public Vendedor BuscarId(Integer id) {
      PreparedStatement st = null;
      ResultSet rs = null;
      try {
        st = conn.prepareStatement(
            "SELECT seller.*,department.Name as DepName "
            + "FROM seller INNER JOIN department "
            + "ON seller.DepartmentId = department.Id "
            + "WHERE seller.Id = ?");
        
        st.setInt(1, id);
        rs = st.executeQuery();
        if (rs.next()) {
          Departamento dep = instantiateDepartment(rs);
          Vendedor obj = instantiateSeller(rs, dep);
          return obj;
        }
        return null;
      }
      catch (SQLException e) {
        throw new DbException("[ERRO] "+e.getMessage());
      }
      finally {
        DataBase.closeStatement(st);
        DataBase.closeResultSet(rs);
      }
    }

    @Override
    public List<Vendedor> BuscarTudo() {
        // TODO Auto-generated method stub
        return null;
    }
    
    private Vendedor instantiateSeller(ResultSet rs, Departamento dep) throws SQLException {
      Vendedor obj = new Vendedor();
      obj.setId(rs.getInt("Id"));
      obj.setNome(rs.getString("Name"));
      obj.setEmail(rs.getString("Email"));
      obj.setSalario(rs.getDouble("BaseSalary"));
      obj.setBithDate(rs.getDate("BirthDate"));
      obj.setDepartamento(dep);
      return obj;
    }
  
    private Departamento instantiateDepartment(ResultSet rs) throws SQLException {
      Departamento dep = new Departamento();
      dep.setId(rs.getInt("DepartmentId"));
      dep.setNome(rs.getString("DepName"));
      return dep;
    }
    public int Test(){
      int x=rowsAffected;
      return x;
    }

}
