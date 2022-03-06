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
            System.out.print("1 [1/0]:");
            x=Sc.nextInt();           
            
            if(x==1){
                Livraria.Incerindo();
                x=4;
            }else if(x==0){

                x=4;
            }
        }while(x!=4);
    }
}
