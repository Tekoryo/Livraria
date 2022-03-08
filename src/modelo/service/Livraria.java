package modelo.service;

import java.sql.Connection;

import modelo.dao.DAOFactory;
import modelo.dao.LivrosDAO;
import modelo.entities.Livros;

public class Livraria {

    private LivrosDAO LivrosDAO=DAOFactory.createLivrosDAO();
    private Livros Livro=new Livros();

    public void Indicador() {
        Incerindo();
        
    }
    public void Incerindo(){
        LivrosDAO.Incerindo(Livro);
    }
    public void Update(){

    }
    public void delete(){

    }
    public void ViewLivraria(){

    }
    public void TestStatus() {
        String X=LivrosDAO.TestStatus();
        System.out.print(X);
    }

}
