package modelo.dao;

import java.util.List;

import modelo.entities.Livros;

public interface LivrosDAO {
    public void Incerindo();
    public void Update();
    public void Remove();
    public List<Livros> ListLivros();
}
