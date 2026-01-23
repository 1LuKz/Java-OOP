import util.Dollar;

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("What is the dollar price: " + Dollar.DOLLAR);
        System.out.println();
        System.out.print("How many dollars will be bought? ");
        double amount = input.nextDouble();

        System.out.print("Amount to be paid in reais: " + Dollar.convertDollar(amount));

        input.close();
    }
}