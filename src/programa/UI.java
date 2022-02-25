package programa;

import java.text.ParseException;
import java.util.Scanner;

import modelo.dao.DAOFactory;
import modelo.dao.VendedorDAO;
import modelo.implementacao.VendedorDaoJDBC;
import modelo.service.VendedorMenu;

public class UI {
    protected Scanner Sc=new Scanner(System.in);
    protected VendedorMenu VendedorMenu=new VendedorMenu();
    public void LogicaIndicador(){   
        System.out.println("==== Bem-Vindo ====");
        int x=0;
        do{
            System.out.println("==== Menu ====");
            System.out.print("Vendedor ou Departamento [1/0]:");
            x=Sc.nextInt();
            
            
            
            if(x==1){
               
                x=4;
            }else if(x==0){
                switch(x){
                    case 1:
                        //
                        break;
                    default:
                        //
                        break;
                }
            }
        }while(x!=4);
    }
}
