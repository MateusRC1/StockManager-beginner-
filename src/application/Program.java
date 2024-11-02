package application;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program{

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product product = new Product();

        System.out.println("Enter product data(name, price, quantity in stock): ");
        product.name = sc.nextLine();
        product.price = sc.nextDouble();
        product.quantity = sc.nextInt();

        System.out.println(product.name + ", " + product.price + ", " + product.quantity);

        sc.close();

    }
}