package programa;

import java.text.ParseException;
import java.util.Scanner;

import modelo.dao.DAOFactory;
import modelo.service.Livraria;


public class UI {
    protected Scanner Sc=new Scanner(System.in);
    protected Livraria Livraria=new Livraria();
    
    public void LogicaIndicador(){   
        System.out.println("==== Bem-Vindo ====");
        int x=0;
        do{
            System.out.println("==== Menu ====");
            System.out.print("Verificar a conectição, Incerindo, Verificar a conectição ou Sair [0/1/2/5]: ");
            x=Sc.nextInt();           
            switch (x) {
                case 0:
                Livraria.TestStatus();   
                x=4;            
                    break;
                case 1:
                Livraria.Incerindo();   
                x=4;   
                    break;
                case 2:
                Livraria.Update();   
                x=4;   
                    break;
                case 5:
                System.out.print("Saindo");                   
                x=4;   
                    break;
                default:
                System.out.print("OPÇÃO INVALIDA!");
                    break;
            }
            
        }while(x!=4);
    }
}
