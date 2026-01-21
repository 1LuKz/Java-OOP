import entities.Triangle;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Triangle triangleX = new Triangle();
        Triangle triangleY = new Triangle();

        System.out.println("Enter the measures of triangle X: ");
        triangleX.a = input.nextDouble();
        triangleX.b = input.nextDouble();
        triangleX.c = input.nextDouble();

        System.out.println("Enter the measures of triangle Y: ");
        triangleY.a = input.nextDouble();
        triangleY.b = input.nextDouble();
        triangleY.c = input.nextDouble();

        System.out.printf("Triangle X area: %.4f%n", triangleX.areaTriangle());
        System.out.printf("Triangle Y area: %.4f%n", triangleY.areaTriangle());

        if(triangleX.areaTriangle() > triangleY.areaTriangle()){
            System.out.println("Large area: X");
        } else {
            System.out.println("Large area: Y");
        }

        input.close();
    }
}