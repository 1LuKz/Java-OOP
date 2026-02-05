import entities.Company;
import entities.Individual;
import entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        List<TaxPayer> taxPayers = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int n = input.nextInt();

        for(int i = 1; i <= n; i++){
            System.out.println();
            System.out.println("Tax payer #" + i + " data");
            System.out.print("Individual or company (I/C)? ");
            char answer = input.next().charAt(0);
            System.out.print("Name: ");
            input.nextLine();
            String name = input.nextLine();
            System.out.print("Annual income: ");
            double annualIncome = input.nextDouble();

            if(answer == 'I' || answer == 'i') {
                System.out.print("Health expenditures: ");
                double healthExpenditures = input.nextDouble();
                taxPayers.add(new Individual(name, annualIncome, healthExpenditures));
            } else if (answer == 'C' || answer == 'c') {
                System.out.print("Number of employees: ");
                int numberOfEmployees = input.nextInt();
                taxPayers.add(new Company(name, annualIncome, numberOfEmployees));
            }
        }

        System.out.println();
        System.out.println("TAXES PAID");
        double sum = 0.0;
        for(TaxPayer taxPayer : taxPayers){
            System.out.println(taxPayer.getName() + " $" + String.format("%.2f", taxPayer.tax()));
            sum += taxPayer.tax();
        }

        System.out.println();
        System.out.println("Total taxes: $" + sum);

        input.close();
    }
}