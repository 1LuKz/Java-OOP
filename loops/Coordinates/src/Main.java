import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Write the coordinate X: ");
        int x = input.nextInt();
        System.out.print("Write the coordinate Y: ");
        int y = input.nextInt();

        while (x != 0 && y != 0) {

            if(x > 0 && y > 0) {
                System.out.println("First");
            } else if(x < 0 && y > 0) {
                System.out.println("Second");
            }  else if(x < 0 && y < 0) {
                System.out.println("Third");
            }  else if(x > 0 && y < 0) {
                System.out.println("Fourth");
            }

            System.out.println();
            System.out.print("Write the coordinate X: ");
            x =input.nextInt();
            System.out.print("Write the coordinate Y: ");
            y =input.nextInt();
        }

        input.close();
    }
}