package programa;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import modelo.database.DataBase;

public class App {
    public static void main(String[] args) throws Exception{
        UI.LogicaIndicador();
        System.out.println("==== Teste ====");
        Connection conn=null;
        Statement st = null;
        ResultSet rs=null;
        try{
            conn=DataBase.getConnection();
            st=conn.createStatement();
            rs= st.executeQuery("select * from department");
            while (rs.next()){
                System.out.println(rs.getInt("Id")+", "+rs.getString("Name"));
            }
        }
        catch (SQLException e){
            e.printStackTrace();
        }
        finally{
            DataBase.closeStatement(st);
            DataBase.closeResultSet(rs);
            DataBase.closeConnection();
        }
    }
}
