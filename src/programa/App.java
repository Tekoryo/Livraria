package programa;

import modelo.database.DataBase;

public class App {
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
