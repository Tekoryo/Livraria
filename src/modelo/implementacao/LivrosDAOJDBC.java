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

    public LivrosDAOJDBC(Connection conn) {
        this.conn = conn;

    }

    public String TestStatus() {
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
        PreparedStatement st = null;
        try {
            st = conn.prepareStatement(
                    "INSERT INTO LIVROS(NOMEDOLIVRO,NOMEDOAUTOR,SEXO,NUMERODEPAGINAS,NOMEDAEDITORA,VALORDOLIVRO,UF,ANOPUBLICACAO)VALUES(?,?,?,?,?,?,?,?)",
                    Statement.RETURN_GENERATED_KEYS);
            st.setString(1, obj.getNomeDoLivro());
            st.setString(2, obj.getNomeDoAutor());
            st.setString(3, obj.getSexo());
            st.setInt(4, obj.getNumeeoDePaginas());
            st.setString(5, obj.getNomeDaEditora());
            st.setDouble(6, obj.getValorDoLivro());
            st.setString(7, obj.getUF());
            st.setInt(8, obj.getAnoPublicacao());

            int rowsAffected = st.executeUpdate();
            System.out.println("\n" + rowsAffected);
        } catch (SQLException e) {
            System.out.print("[ERRO] " + e.getMessage());
        }
    }

    @Override
    public void Update(Livros obj) {
        // TODO Auto-generated method stub

    }

    @Override
    public void Remove(Livros obj) {
        try{
            st=conn.prepareStatement("arg0");
        }
        catch(SQLException e){
            throw new DbException(e.getMessage());
        }
        
    }

    @Override
    public List<Livros> ListLivros(Livros obj) {
        // TODO Auto-generated method stub
        return null;
    }

}
