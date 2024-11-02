package application;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program{

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in); //variavel scanner

        Product product = new Product(); //cria o produto

        System.out.println("Enter product data(name, price, quantity in stock): ");
        product.name = sc.nextLine(); //nome
        product.price = sc.nextDouble(); //preço
        product.quantity = sc.nextInt(); //quantidade

        System.out.println("Product data: " + product); //imprime todas as informações

        System.out.println("Enter the number of products to be added in stock: ");
        int quantity = sc.nextInt(); //quantidade a ser adicionada
        product.addProducts(quantity); //adiciona no estoque a quantidade informada

        System.out.println("Updated data: " + product); //imprime as informaçoes atualizadas

        System.out.println("Enter the number of products to be remove from stock: ");
        quantity = sc.nextInt(); //quantidade a ser removida
        product.removeProducts(quantity); //remove do estoque a quantidade informada

        System.out.println("Updated data: " + product); //imprime as informaçoes atualizadas

        sc.close(); //fecha a variavel scanner
    }
}