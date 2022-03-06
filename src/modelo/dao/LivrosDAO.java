package modelo.dao;

import java.util.List;

import modelo.entities.Livros;
import modelo.service.Livraria;

public interface LivrosDAO {
    public void Incerindo();
    public void Update(Livros obj);
    public void Remove(Livros obj);
    public List<Livros> ListLivros(Livros obj);
}
