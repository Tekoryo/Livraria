package modelo.dao;

import modelo.database.DataBase;
import modelo.implementacao.VendedorDaoJDBC;

public class DAOFactory {
    public static VendedorDAO createVendedorDAO(){
        return new VendedorDaoJDBC(DataBase.getConnection());
    }
}
