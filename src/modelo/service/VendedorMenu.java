package modelo.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.sql.Date;
import java.util.List;
import java.util.Scanner;

import modelo.dao.DAOFactory;
import modelo.dao.VendedorDAO;
import modelo.entities.Departamento;
import modelo.entities.Vendedor;
import modelo.implementacao.VendedorDaoJDBC;

public class VendedorMenu {
    protected Scanner Sc=new Scanner(System.in);
    protected Vendedor Vendedor=new Vendedor();
    protected VendedorDAO VendedorDAO=DAOFactory.createVendedorDAO();
    SimpleDateFormat Sdc=new SimpleDateFormat("yyyy/MM/dd-00:00:00");
    Departamento x=new Departamento();

    public void indicador(){
        System.out.println("\n=== Vendedor Indicador ===");
        UpdateVendedor();

    }

    public void UpdateVendedor(){
        System.out.println("\n=== Vendedor update =====");
        
        //So esta pengando Base Salarial e ID
        System.out.println("Modificar Nome, Email, Data de nascimento, Base salarial, Departamento ou todos[1/2/3/4/5/6]: ");
        int Escolha=Sc.nextInt();
        
        switch (Escolha) {
            case 1:
                    System.out.print("Novo Nome:");
                    String Nome=Sc.next();
                    Vendedor.setNome(Nome);
                break;
            case 2:
                    System.out.print("Aumento do Salario:");
                    String Email=Sc.next();
                    Vendedor.setEmail(Email);
                break;
            case 3:
                    System.out.print("Aumento do Salario:");
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
                    System.out.print("Aumento do Salario:");
                    int departamentoId=Sc.nextInt();
                    Vendedor.setDepartamento(departamentoId);
                break;
                case 6:
                    System.out.print("Novo Nome:");
                    Nome=Sc.next();
                        Vendedor.setNome(Nome);
                    System.out.print("Aumento do Salario:");
                    Email=Sc.next();
                        Vendedor.setEmail(Email);
                    System.out.print("Aumento do Salario:");
                    try {
                        Date DataNascimento = new java.sql.Date(Sdc.parse(Sc.next()).getTime());
                        Vendedor.setBithDate(DataNascimento);
                    } catch (ParseException e) {
                        System.out.print("[ERRO] "+e.getMessage());
                    }
                    System.out.print("Aumento do Salario:");
                    Money=Sc.nextDouble();
                        Vendedor.setSalario(Money);
                    System.out.print("Aumento do Salario:");
                        departamentoId=Sc.nextInt();
                        Vendedor.setDepartamento(departamentoId);
                break;
            default:
                System.out.print("OPÇÃO INVALIDA!");
                break;
            }
            //Maria Green
        // Muda para id da pessoa e não do departamento
        System.out.print("ID do departamento a ser modificado: ");
        int ID=Sc.nextInt();
        Vendedor=VendedorDAO.BuscarId(ID); 
        VendedorDAO.Update(Vendedor);
        System.out.println("Done! Rows affected: "+ VendedorDAO.Test());
    }
}
