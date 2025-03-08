package application;

import dao.DaoFactory;
import dao.SellerDao;
import entities.Department;
import entities.Seller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("=== Teste 1: seller findById ===");
        Seller seller = sellerDao.findById(2);
        System.out.println(seller);

        System.out.println("\n === Teste 2: seller findByDepartment ===");
        List<Seller> sellers = sellerDao.findByDepartment(seller.getDepartment());
        for (Seller e : sellers) {
            System.out.println(e);
        }

        System.out.println("\n === Teste 3: seller findAll ===");
        sellers = sellerDao.findAll();
        for (Seller e : sellers) {
            System.out.println(e);
        }

        System.out.println("\n === Teste 4: seller insert ===");
        Seller newSeller = new Seller(null, "Camille", "ca@gmail.com", new Date(), 20000.0, new Department(2, null));
        sellerDao.insert(newSeller);
        System.out.println("Inserted! New id = " + newSeller.getId());

        System.out.println("\n === Teste 5: seller update ===");
        seller = sellerDao.findById(1);
        seller.setName("Martha Waine");
        sellerDao.update(seller);
        System.out.println(sellerDao.findById(1));

    }
}
