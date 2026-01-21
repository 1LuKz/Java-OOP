import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n  = input.nextInt();
        int in = 0, out = 0;

        for (int i = 1; i <= n; i++) {
          int x =  input.nextInt();

          if(x >= 10 && x <= 20){
              in++;
          } else {
              out++;
          }
        }

        System.out.println(in + " in");
        System.out.println(out + " out");

        input.close();
    }
}