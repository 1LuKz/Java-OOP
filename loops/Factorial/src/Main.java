import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        double factorial = 1.0;

        for(int i = 1; i <= n; i++){
            factorial *= i;
        }

        System.out.println(factorial);

        input.close();
    }
}