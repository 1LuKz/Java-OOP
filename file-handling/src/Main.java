import entities.Product;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        List<Product> products = new ArrayList<>();

        System.out.print("Enter the FULL path of the input CSV file: ");
        String sourceFileStr = input.nextLine();

        File sourceFile = new File(sourceFileStr);

        if (!sourceFile.exists()) {
            System.out.println("File does not exist!");
            return;
        }

        String desktopPath = System.getProperty("user.home") + File.separator + "Desktop";
        File targetFile = new File(desktopPath, "summary.csv");

        try (BufferedReader br = new BufferedReader(new FileReader(sourceFile))) {

            String line;
            while ((line = br.readLine()) != null) {

                if (!line.trim().isEmpty()) {

                    String[] fields = line.split(",");

                    if (fields.length == 3) {
                        String name = fields[0].trim();
                        double price = Double.parseDouble(fields[1].trim());
                        int quantity = Integer.parseInt(fields[2].trim());

                        products.add(new Product(name, price, quantity));
                    }
                }
            }

            try (BufferedWriter bw = new BufferedWriter(new FileWriter(targetFile))) {

                for (Product product : products) {
                    bw.write(product.getName() + "," +
                            String.format("%.2f", product.totalPrice()));
                    bw.newLine();
                }

                System.out.println("Summary file created at:");
                System.out.println(targetFile.getAbsolutePath());
            }

        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        }

        input.close();
    }
}