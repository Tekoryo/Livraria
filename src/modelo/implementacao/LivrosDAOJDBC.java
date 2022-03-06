package modelo.implementacao;

import java.sql.Connection;
import java.util.List;

import modelo.dao.LivrosDAO;
import modelo.entities.Livros;

public class LivrosDAOJDBC implements LivrosDAO {

    private Connection conn;
    
    public LivrosDAOJDBC(Connection conn){
        this.conn=conn;
    }

    @Override
    public void Incerindo() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void Update() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void Remove() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public List<Livros> ListLivros() {
        // TODO Auto-generated method stub
        return null;
    }
    
}
