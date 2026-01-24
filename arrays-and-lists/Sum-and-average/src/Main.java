import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        double sum = 0.0;
        double average = 0.0;

        System.out.print("Enter the N: ");
        int n = input.nextInt();
        double[] array = new double[n];

        for(int i = 0; i < array.length; i++){
            System.out.print("Enter the number: ");
            array[i] = input.nextDouble();
            sum += array[i];
        }

        average = sum / array.length;

        System.out.println();
        System.out.print("Numbers: ");
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }

        System.out.println();
        System.out.println("Sum = " + sum);
        System.out.println("Average: " + average);

        input.close();
    }
}