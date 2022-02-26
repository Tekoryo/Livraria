package modelo.service;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import modelo.dao.DAOFactory;
import modelo.dao.VendedorDAO;
import modelo.entities.Departamento;
import modelo.entities.Vendedor;

public class VendedorMenu {
    protected Scanner Sc=new Scanner(System.in);
    protected Vendedor Vendedor=new Vendedor();
    protected VendedorDAO VendedorDAO=DAOFactory.createVendedorDAO();
    SimpleDateFormat Sdc=new SimpleDateFormat("yyyy/MM/dd");
    Departamento departamento=new Departamento();

    public void indicador(){
        System.out.println("\n=== Vendedor Indicador ===");
        System.out.print("Update, Incerir [1/2]:");
        int y=Sc.nextInt();

        int loop=0;
        do{
            switch(y){
                case 1:
                    UpdateVendedor();
                    loop=0;
                    break;
                case 2:
                    IncerindoVendedor();
                    loop=0;
                    break;
                default:
                    //
                    System.out.println();
                    System.out.print("Selecione uma opção Update ou Incerir [1/2]:");
                    y=Sc.nextInt();
                    loop=1;
                    break;
            }
        }while(loop==1);
        
    }
    
    public void UpdateVendedor(){

        System.out.println("\n=== Vendedor update =====");
        System.out.print("ID a modificado: ");
        int Id=Sc.nextInt();
        
        System.out.println("Modificar Nome, Email, Data de nascimento, Base salarial, Departamento ou todos[1/2/3/4/5/6]: ");
        int Escolha=Sc.nextInt();
        
        switch (Escolha) {
            case 1:
                    System.out.print("Novo Nome:");
                    String Nome=Sc.next();
                    Vendedor.setNome(Nome);
                break;
            case 2:
                    System.out.print("Novo Email:");
                    String Email=Sc.next();
                    Vendedor.setEmail(Email);
                break;
            case 3:
                    System.out.print("Nova data de nacimento:");
                try {
                    Date DataNascimento = new java.sql.Date(Sdc.parse(Sc.next()).getTime());
                    Vendedor.setBithDate(DataNascimento);
                } catch (ParseException e) {
                    System.out.print("[ERRO] "+e.getMessage());
                }
                break;
            case 4:
                    System.out.print("Aumento do Salario:");
                    double Money=Sc.nextDouble();
                    Vendedor.setSalario(Money);
                break;
            case 5:
                    System.out.print("Novo departamento:");
                    int departamentoId=Sc.nextInt();
                    Vendedor.setDepartamento(departamentoId);
                break;
                case 6:
                    System.out.print("Novo Nome:");
                    Nome=Sc.next();
                        Vendedor.setNome(Nome);
                    System.out.print("Novo Email:");
                    Email=Sc.next();
                        Vendedor.setEmail(Email);
                    System.out.print("Nova data de nacimento:");
                    try {
                        Date DataNascimento = new java.sql.Date(Sdc.parse(Sc.next()).getTime());
                        Vendedor.setBithDate(DataNascimento);
                    } catch (ParseException e) {
                        System.out.print("[ERRO] "+e.getMessage());
                    }
                    System.out.print("Aumento do Salario:");
                    Money=Sc.nextDouble();
                        Vendedor.setSalario(Money);
                    System.out.print("Novo departamento:");
                        departamentoId=Sc.nextInt();
                        Vendedor.setDepartamento(departamentoId);
                break;
            default:
                System.out.print("OPÇÃO INVALIDA!");
                break;
            }

        Vendedor=VendedorDAO.BuscarId(Id); 
        VendedorDAO.Update(Vendedor);
        System.out.println("UPDATE Completo!");
    }

    public void IncerindoVendedor(){
        System.out.println("\n=== Vendedor Incerir Dados =====");
        
        System.out.print("Email:");
            String Email=Sc.next();
        System.out.print("Nome:");
            String Nome=Sc.next();



        System.out.println("==== data de nacimento: ====");  
            System.out.print("Dia:");
                int DD=Sc.nextInt();
            System.out.print("Mes:");
                int MM=Sc.nextInt();
            System.out.print("Ano:");
                int YYYY=Sc.nextInt();     
        System.out.print("Salario Inicial:");
            double Money=Sc.nextDouble();                
        
        Vendedor novoVendedor=new Vendedor(null, Nome, Email, new Date(YYYY/MM/DD), Money, departamento);
        VendedorDAO.Incerindo(novoVendedor);
        System.out.println("Incerido! Novo ID = " + novoVendedor.getId());

    }

    public void deleteVendadeor(){
        
    }

}
