import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int alcohol = 0;
        int gasoline =0;
        int diesel = 0;

        int fuel = input.nextInt();

        while (fuel != 4){
            if(fuel == 1){
                alcohol++;
            } else if(fuel == 2){
                gasoline++;
            } else if(fuel == 3){
                diesel++;
            }
            fuel = input.nextInt();
        }

        System.out.println("Thank you so much!");
        System.out.println("Alcohol: " + alcohol);
        System.out.println("Gasoline: " + gasoline);
        System.out.println("Diesel: " + diesel);

        input.close();
    }
}