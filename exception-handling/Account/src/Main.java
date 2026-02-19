import entities.Account;
import exception.BusinessException;

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter account data");
        System.out.print("Number: ");
        int number = input.nextInt();
        System.out.print("Holder: ");
        input.nextLine();
        String name = input.nextLine();
        System.out.print("Initial balance: ");
        double balance = input.nextDouble();
        System.out.print("Withdraw limit: ");
        double withdrawLimit = input.nextDouble();

        Account account = new Account(number, name, balance, withdrawLimit);

        System.out.println();
        System.out.print("Enter amount for withdraw: ");
        double amount = input.nextDouble();

        try{
            account.withdraw(amount);
            System.out.printf("New balance: %.2f%n", account.getBalance());
        } catch (BusinessException e) {
            System.out.println(e.getMessage());
        }

        input.close();
    }
}