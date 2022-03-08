package programa;

import java.util.Locale;

import modelo.database.DataBase;

public class App {
    static Locale Locale1=new Locale("EN");
    static UI UI=new UI();
    public static void main(String[] args) {
        try{
            UI.LogicaIndicador();
        }
        catch(Exception e){
            System.out.print("[ERRO] " +e.getMessage());
        }
        finally{
            DataBase.closeConnection();
        }
        
    }
}
