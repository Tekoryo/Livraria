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
    public String TestStatus(){
        String status;
        if (conn != null) {

            status = "STATUS--->Conectado com sucesso!";

        } else {

            status = "STATUS--->Não foi possivel realizar conexão";

        }
        return status;

    }
    @Override
    public void Incerindo(Livros obj) {
        PreparedStatement st=null;
        try{
            st=conn.prepareStatement(
                "INSERT INTO LIVROS(NOMEDOLIVRO,NOMEDOAUTOR,SEXO,NUMERODEPAGINAS,NOMEDAEDITORA,VALORDOLIVRO,UF,ANOPUBLICACAO)VALUES(?,?,?,?,?,?,?,?)",Statement.RETURN_GENERATED_KEYS);   
            st.setString(1,"Teste2");
            st.setString(2,"AutoTeste");
            st.setString(3,"F");
            st.setInt(4, 490);
            st.setString(5,"Sefer");
            st.setFloat(6, (float) 40.98);
            st.setString(7,"ES");
            st.setInt(8, 2022);

            int rowsAffected = st.executeUpdate();
			System.out.println("\n"+rowsAffected);
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
