import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws ParseException {
        Scanner input = new Scanner(System.in);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd/yyyy");

        System.out.println("Enter client data");
        System.out.print("Name: ");
        String name = input.nextLine();
        System.out.print("Email: ");
        String email = input.nextLine();
        System.out.print("Birth date (MM/dd/yyyy): ");
        Date birthDate = simpleDateFormat.parse(input.next());

        Client client = new Client(name, email, birthDate);

        System.out.print("Status: ");
        OrderStatus orderStatus = OrderStatus.valueOf(input.next());

        Order order = new Order(new Date(), orderStatus, client);

        System.out.print("How many items to this order: ");
        int n = input.nextInt();

        for(int i = 1; i <= n; i++){
            System.out.println();
            System.out.println("Enter #" + i + " item data");
            System.out.print("Product name: ");
            input.nextLine();
            String productName = input.nextLine();
            System.out.print("Product price: ");
            double productPrice = input.nextDouble();

            Product product = new Product(productName, productPrice);

            System.out.print("Quantity: ");
            int quantity = input.nextInt();

            OrderItem orderItem = new OrderItem(quantity, productPrice, product);
            order.addItem(orderItem);
        }

        System.out.println();
        System.out.println("ORDER SUMMARY");
        System.out.println(order);

        input.close();
    }
}