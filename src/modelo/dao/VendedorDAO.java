package modelo.dao;

import java.util.List;

import modelo.entities.Vendedor;

public interface VendedorDAO {

    void Incerindo(Vendedor obj);
    void Update(Vendedor obj);
    void DeleteId(Integer id);
    Vendedor BuscarId(Integer id);
    List<Vendedor> BuscarTudo();
    int Test();
        
}
