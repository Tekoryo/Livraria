package programa;

import java.sql.Connection;

import modelo.database.DataBase;

public class App {
    public static void main(String[] args)throws Exception {
        Connection conn =DataBase.getConnection(); 
        System.out.print("Ok");
        DataBase.closeConnection();
        
    }
}
