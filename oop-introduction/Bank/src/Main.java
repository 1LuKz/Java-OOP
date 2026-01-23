import entities.Account;

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Account user;

        System.out.print("Enter account number: ");
        int numberAccount = input.nextInt();
        System.out.print("Enter account holder: ");
        input.nextLine();
        String nameAccount = input.nextLine();
        System.out.print("Is there an initial deposit (Y/N)? ");
        char answer = input.next().charAt(0);

        if(answer == 'Y'){
            System.out.print("Enter initial deposit value: ");
            double balance = input.nextDouble();
            user = new Account(numberAccount, nameAccount, balance);
        } else {
            user = new Account(numberAccount, nameAccount);
        }

        System.out.println();
        System.out.println("Account data");
        System.out.println(user.toString());

        System.out.println();
        System.out.print("Enter a deposit value: ");
        double amount = input.nextDouble();
        user.depositAccount(amount);

        System.out.println();
        System.out.println("Updated account data");
        System.out.println(user.toString());

        System.out.println();
        System.out.print("Enter a withdraw value: ");
        amount = input.nextDouble();
        user.withdrawAccount(amount);

        System.out.println();
        System.out.println("Updated account data");
        System.out.println(user.toString());

        input.close();
    }
}