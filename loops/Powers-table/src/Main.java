import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        for(int i = 1; i <= n; i++){
            int first = i;
            int second = i * i;
            int third = i * i * i;
            System.out.printf("%d %d %d%n", first, second, third);
        }

        input.close();
    }
}