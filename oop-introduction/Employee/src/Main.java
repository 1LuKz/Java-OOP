import entities.Employee;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Employee employee = new Employee();

        System.out.print("Name: ");
        employee.name = input.nextLine();
        System.out.print("Gross salary: ");
        employee.grossSalary = input.nextDouble();
        System.out.print("Tax: ");
        employee.tax = input.nextDouble();

        System.out.println(employee.toString());

        System.out.print("Which percentage to increase salary? ");
        double percentage = input.nextDouble();
        employee.increaseSalary(percentage);

        System.out.println(employee.toString());

        input.close();
    }
}