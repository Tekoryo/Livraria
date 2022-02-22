package modelo.implementacao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

import modelo.dao.VendedorDAO;
import modelo.database.DataBase;
import modelo.database.DbException;
import modelo.entities.Vendedor;

public class VendedorDaoJDBC implements VendedorDAO {
    private Statement st = null;
    private ResultSet rs=null;
    private static Connection conn;

    public VendedorDaoJDBC(Connection conn) {
        this.conn=conn;
    }
    
    @Override
    public void Incerindo(Vendedor obj) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void Update(Vendedor obj) {
      try{

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
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Vendedor> BuscarTudo() {
        // TODO Auto-generated method stub
        return null;
    }
    

}
