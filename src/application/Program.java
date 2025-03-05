package application;

import entities.Department;
import entities.Seller;

import java.util.Date;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Department obj = new Department(1, "Books");

        Seller seller = new Seller(1, "Camille", "ca@gmail.com", new Date() , 5500.0, obj);

        System.out.println(obj);
        System.out.println(seller);
    }
}
