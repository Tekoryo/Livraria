package modelo.dao;

import modelo.database.DataBase;
import modelo.implementacao.LivrosDAOJDBC;

public class DAOFactory {
    public static LivrosDAO createLivrosDAO(){
           return new LivrosDAOJDBC(DataBase.getConnection());
    }
}
