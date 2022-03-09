package modelo.dao;

import java.util.List;

import modelo.entities.Livros;
import modelo.service.Livraria;

public interface LivrosDAO {
    public String TestStatus();
    public void Incerindo(Livros obj);
    public void Update(Livros obj);
    public void Remove(Livros obj);
    public List<Livros> ListLivros(Livros obj);
    public void find(String NomeDoLivro,String NomeDoAutor);

}
