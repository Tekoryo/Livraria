package modelo.service;

import java.util.Scanner;

import modelo.dao.DAOFactory;
import modelo.dao.LivrosDAO;
import modelo.entities.Livros;

public class Livraria {
    
    protected Scanner Sc=new Scanner(System.in);
    private LivrosDAO LivrosDAO=DAOFactory.createLivrosDAO();
    private Livros Livro=new Livros();

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
        
        System.out.println(" ===== Modificando Livro do Estoque  ===== ");
        
        System.out.print("Nome do Livro: ");
        String NomeDoLivro=Sc.next();
        System.out.print("Nome do Autor: ");
        String NomeDoAutor=Sc.next();
        
        LivrosDAO.find(NomeDoLivro, NomeDoAutor);
        

        System.out.print("Dado que pretende modificar: | NOMEDOLIVRO,NOMEDOAUTOR,SEXO,NUMERODEPAGINAS,NOMEDAEDITORA,VALORDOLIVRO,UF,ANOPUBLICACAO, TODOS | [1/2/3/4/5/6/7/8/9]: ");
        int modificar=Sc.nextInt();

        int Sair=0;

        do{
            switch (modificar) {

                case 1:
                    System.out.print("Nome do Livro: ");
                    NomeDoLivro=Sc.next();
                    Livro.setNomeDoLivro(NomeDoLivro);
                    Sair=0;
                        break;
                case 2: 
                    System.out.print("Nome do Autor: ");
                    NomeDoAutor=Sc.next();
                    Livro.setNomeDoAutor(NomeDoAutor);
                    Sair=0;
                        break;
                case 3: 
                    System.out.print("Sexo do Autor [F/M]: ");
                    String Sexo=Sc.next();
                    Livro.setSexo(Sexo);
                    Sair=0;
                        break;
                case 4: 
                    System.out.print("Número de Pagínas do livro: ");
                    int NumeroDePaginas=Sc.nextInt();
                    Livro.setNumeroDePaginas(NumeroDePaginas);
                    Sair=0;
                        break;
                case 5: 
                    System.out.print("Nome da Editora: ");
                    String NomeDaEditora=Sc.next();
                    Livro.setNomeDaEditora(NomeDaEditora);
                    Sair=0;
                        break;
                case 6: 
                    System.out.print("Valor do livro: ");
                    double ValorDoLivro=Sc.nextDouble();
                    Livro.setValorDoLivro(ValorDoLivro);
                    Sair=0;
                        break;
                case 7: 
                    System.out.print("Estado da editora [Ex.: SP]: ");
                    String UF=Sc.next();
                    Livro.setUF(UF);
                    Sair=0;
                        break;
                case 8: 
                    System.out.print("Ano da publicação: ");
                    int AnoPublicacao=Sc.nextInt();
                    Livro.setAnoPublicacao(AnoPublicacao);
                    Sair=0;
                        break;
                case 9: 
                    System.out.print("Nome do Livro: ");
                    NomeDoLivro=Sc.next();
                    Livro.setNomeDoLivro(NomeDoLivro);
                    System.out.print("Nome do Autor: ");
                    NomeDoAutor=Sc.next();
                    Livro.setNomeDoAutor(NomeDoAutor);
                    System.out.print("Sexo do Autor [F/M]: ");
                    Sexo=Sc.next();
                    Livro.setSexo(Sexo);
                    System.out.print("Número de Pagínas do livro: ");
                    NumeroDePaginas=Sc.nextInt();
                    Livro.setNumeroDePaginas(NumeroDePaginas);
                    System.out.print("Nome da Editora: ");
                    NomeDaEditora=Sc.next();
                    Livro.setNomeDaEditora(NomeDaEditora);
                    System.out.print("Valor do livro: ");
                    ValorDoLivro=Sc.nextDouble();
                    Livro.setValorDoLivro(ValorDoLivro);
                    System.out.print("Estado da editora [Ex.: SP]: ");
                    UF=Sc.next();
                    Livro.setUF(UF);
                    System.out.print("Ano da publicação: ");
                    AnoPublicacao=Sc.nextInt();
                    Livro.setAnoPublicacao(AnoPublicacao);
                    Sair=0;
                        break;
                    default:
                    System.out.print("OPÇÃO INVALIDA!");
                    Sair=1;
                        break;
                }
            }while(Sair==1); 
            
            LivrosDAO.Update(Livro);  
    }
    public void delete(){

    }
    public void ViewLivraria(){

    }
    public void TestStatus() {
        System.out.print(LivrosDAO.TestStatus());
    }

}
