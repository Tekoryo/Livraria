package modelo.service;

import java.util.List;
import java.util.Scanner;

import modelo.dao.DAOFactory;
import modelo.dao.VendedorDAO;
import modelo.entities.Vendedor;
import modelo.implementacao.VendedorDaoJDBC;

public class VendedorMenu {
    private Scanner Sc=new Scanner(System.in);
    private Vendedor Vendedor=new Vendedor();
    private VendedorDAO VendedorDAO=DAOFactory.createVendedorDAO();

    public void indicador(){
        System.out.println("\n=== Vendedor Indicador ===");
        UpdateVendedor();

    }

    public void UpdateVendedor(){
        System.out.println("\n=== Vendedor update =====");
        
        //So esta pengando Base Salarial e ID
        
        Vendedor=VendedorDAO.BuscarId(1);
        //Maria Green
        System.out.print("Novo Nome:");
        String Nome=Sc.next();
        Vendedor.setNome(Nome);
        //double Money=Sc.nextDouble();
        //Vendedor.setSalario(Money);
        VendedorDAO.Update(Vendedor);
        System.out.println("Done! Rows affected: "+ VendedorDAO.Test());
    }
}
