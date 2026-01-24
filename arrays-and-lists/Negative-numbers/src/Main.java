import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the N: ");
        int n = input.nextInt();
        int[] array = new int[n];

        for(int i = 0; i < array.length; i++){
            System.out.print("Enter the number: ");
            array[i] = input.nextInt();
        }

        System.out.println();
        System.out.println("Negative numbers");

        for(int i = 0; i < array.length; i++){
            if(array[i] < 0){
                System.out.println(array[i]);
            }
        }

        input.close();
    }
}