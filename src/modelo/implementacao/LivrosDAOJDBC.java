package modelo.implementacao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import modelo.dao.LivrosDAO;
import modelo.database.DataBase;
import modelo.entities.Livros;
import modelo.database.DbException;

public class LivrosDAOJDBC implements LivrosDAO {

    private Connection conn;
    
    public LivrosDAOJDBC(Connection conn){
        this.conn=conn;
    }

    @Override
    public void Incerindo() {
        // TODO Auto-generated method stub
        PreparedStatement st=null;
        try{
            st=conn.prepareStatement(
                "INSERT INTO LIVROS(NOMEDOLIVRO,NOMEDOAUTOR,SEXO,NUMERODEPAGINAS,NOMEDAEDITORA,VALORDOLIVRO,UF,ANOPUBLICACAO)VALUES(?,?,?,?,?,?,?,?)",Statement.RETURN_GENERATED_KEYS);
            st.setString(1, "Teste");
            st.setString(2, "AutoTeste");
            st.setString(3, "AutoTeste");
            st.setString(4, "M");
            st.setInt(5, 490);
            st.setString(6, "Sefer");
            st.setFloat(7, (float) 40.98);
            st.setInt(8, 2022);

            int rowsAffected = st.executeUpdate();
			
			if (rowsAffected > 0) {
				ResultSet rs = st.getGeneratedKeys();
				if (rs.next()) {
					int id = rs.getInt(1);
					
				}
				DataBase.closeResultSet(rs);
			}
			else {
				throw new DbException("Unexpected error! No rows affected!");
			}
        }
        catch(SQLException e){
            System.out.print("[ERRO] "+e.getMessage());
        }
    }

    @Override
    public void Update(Livros obj) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void Remove(Livros obj) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public List<Livros> ListLivros(Livros obj) {
        // TODO Auto-generated method stub
        return null;
    }

    
}
