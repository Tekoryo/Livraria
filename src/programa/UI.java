package programa;

import java.text.ParseException;
import java.util.Scanner;

public class UI {
    protected static Scanner Sc=new Scanner(System.in);
    public static void LogicaIndicador(){   
        System.out.println("==== Bem-Vindo ====");
        int x=0;
        do{
            System.out.println("==== Menu ====");
            System.out.print(":");
            x=Sc.nextInt();

            switch(x){
                case 1:
                    //
                    break;
                default:
                    //
                    break;
            }
        }while(x!=4);
    }
}
