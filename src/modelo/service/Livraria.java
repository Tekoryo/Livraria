package modelo.service;

import modelo.dao.DAOFactory;
import modelo.dao.LivrosDAO;
import modelo.entities.Livros;

public class Livraria {

    private LivrosDAO LivrosDAO=DAOFactory.createLivrosDAO();
    private Livros Livro=new Livros();

    public void indicador() {
        LivrosDAO.Incerindo();
        
    }
    public void Incerindo(){
        
    }
    public void Update(){

    }
    public void delete(){

    }
    public void ViewLivraria(){

    }
}
