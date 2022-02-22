package modelo.service;

import java.util.List;

import modelo.entities.Departamento;

public interface DepartamentoDAO {

    void Incerindo(Departamento obj);
    void Update(Departamento obj);
    void DeleteId(Integer id);
    Departamento BuscarId(Integer id);
    List<Departamento> BuscarTudo();
    
}
