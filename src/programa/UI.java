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
            
            System.out.print("Update [1/0]:");
            int y=Sc.nextInt();
            
            if(x==1){
                int loop=0;
                do{
                    switch(y){
                        case 1:
                            VendedorMenu.indicador();
                            loop=0;
                            break;
                        default:
                            //
                            System.out.println();
                            System.out.print("Selecione uma opção Update [1]:");
                            y=Sc.nextInt();
                            loop=1;
                            break;
                    }
                }while(loop==1);
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
