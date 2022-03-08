package modelo.service;

import java.util.Scanner;

import modelo.dao.DAOFactory;
import modelo.dao.LivrosDAO;
import modelo.entities.Livros;

public class Livraria {
    
    protected Scanner Sc=new Scanner(System.in);
    private LivrosDAO LivrosDAO=DAOFactory.createLivrosDAO();
    private Livros Livro;

    public void Incerindo(){
        System.out.println(" ===== Adicionando Livro ao Estoque  ===== ");

        System.out.print("Nome do Livro: ");
        String NomeDoLivro=Sc.next();
        System.out.print("Nome do Autor: ");
        String NomeDoAutor=Sc.next();
        System.out.print("Sexo do Autor [F/M]: ");
        String Sexo=Sc.next();
        System.out.print("Número de Pagínas do livro: ");
        int NumeroDePaginas=Sc.nextInt();
        System.out.print("Nome da Editora: ");
        String NomeDaEditora=Sc.next();
        System.out.print("Valor do livro: ");
        double ValorDoLivro=Sc.nextDouble();
        System.out.print("Estado da editora [Ex.: SP]: ");
        String UF=Sc.next();
        System.out.print("Ano da publicação: ");
        int AnoPublicacao=Sc.nextInt();
        
        Livro=new Livros(NomeDoLivro, NomeDoAutor, Sexo, NumeroDePaginas, NomeDaEditora, ValorDoLivro, UF, AnoPublicacao);
        
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
