import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Write the password: ");
        int password = input.nextInt();

        while (password != 2002) {
            System.out.println("Invalid password!");
            System.out.println();
            System.out.print("Write the password: ");
            password = input.nextInt();
        }

        System.out.print("The password is correct!");

        input.close();
    }
}