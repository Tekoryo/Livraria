package modelo.dao;

import modelo.service.VendedorDaoJDBC;

public class DAOFactory {
    public static VendedorDAO createVendedorDAO(){
        return new VendedorDaoJDBC();
    }
}
