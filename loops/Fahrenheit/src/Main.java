import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String repeat;

        do {
            System.out.print("Enter the celsius value: ");
            double celsius = input.nextDouble();

            double fahrenheit = 9.0 * celsius / 5.0 + 32.0;
            System.out.printf("Fahrenheit: %.1f%n", fahrenheit);

            System.out.print("Repeat? (Yes/No): ");
            repeat = input.next();
        } while (repeat != "No");

        input.close();
    }
}