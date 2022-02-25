package programa;

import java.text.ParseException;
import java.util.Scanner;

import modelo.dao.DAOFactory;
import modelo.dao.VendedorDAO;
import modelo.implementacao.VendedorDaoJDBC;
import modelo.service.DepartamentoMenu;
import modelo.service.VendedorMenu;

public class UI {
    protected Scanner Sc=new Scanner(System.in);
    protected VendedorMenu VendedorMenu=new VendedorMenu();
    protected DepartamentoMenu DepartamentoMenu=new DepartamentoMenu();
    public void LogicaIndicador(){   
        System.out.println("==== Bem-Vindo ====");
        int x=0;
        do{
            System.out.println("==== Menu ====");
            System.out.print("Vendedor ou Departamento [1/0]:");
            x=Sc.nextInt();           
            
            if(x==1){
               VendedorMenu.indicador();
                x=4;
            }else if(x==0){
                DepartamentoMenu.indicador();
            }
        }while(x!=4);
    }
}
