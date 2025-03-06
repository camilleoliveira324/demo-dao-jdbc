package application;

import dao.DaoFactory;
import dao.SellerDao;
import entities.Department;
import entities.Seller;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

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
    }
}
