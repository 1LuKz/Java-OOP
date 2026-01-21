import entities.Product;

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Product product = new Product();

        System.out.println("Enter product data");
        System.out.print("Name: ");
        product.name = input.nextLine();
        System.out.print("Price: ");
        product.price = input.nextDouble();
        System.out.print("Quantity: ");
        product.quantity = input.nextInt();

        System.out.println(product.toString());

        System.out.print("Enter the number of products to be added in stock: ");
        int quantity = input.nextInt();
        product.addProducts(quantity);

        System.out.println(product.toString());

        System.out.print("Enter the number of products to be remove in stock: ");
        quantity = input.nextInt();
        product.removeProducts(quantity);

        System.out.println(product.toString());

        input.close();
    }
}