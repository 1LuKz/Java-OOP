import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws ParseException {
        Scanner input = new Scanner(System.in);
        List<Product> products = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int n = input.nextInt();

        for(int i = 1; i <= n; i++){
            System.out.println();
            System.out.print("Common, used or imported (C/U/I)? ");
            char answer = input.next().charAt(0);
            System.out.print("Name: ");
            input.nextLine();
            String name = input.nextLine();
            System.out.print("Price: ");
            double price = input.nextDouble();

            if(answer == 'U' || answer == 'u'){
                System.out.print("Manufacture date (MM/DD/YYYY): ");
                LocalDate date = LocalDate.parse(input.next(), DateTimeFormatter.ofPattern("MM/dd/yyyy"));
                products.add(new UsedProduct(name, price, date));
            } else if (answer == 'I' || answer == 'i') {
                System.out.print("Customs fee: ");
                double customFee = input.nextDouble();
                products.add(new ImportedProduct(name, price, customFee));
            } else {
                products.add(new Product(name, price));
            }
        }

        System.out.println();
        System.out.println("PRICE TAGS");
        for(Product product : products){
            System.out.println(product.priceTag());
        }

        input.close();
    }
}