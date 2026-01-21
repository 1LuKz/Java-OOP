import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        double total = 0;

        for(int i = 0; i < n; i++){
            double numerator = input.nextDouble();
            double denominator = input.nextDouble();

            if(denominator == 0){
                System.out.println("Division impossible");
            } else{
                total = numerator / denominator;
                System.out.printf("%.1f%n", total);
            }
        }

        input.close();
    }
}