import entities.Employee;
import entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        List<Employee> employees = new ArrayList<>();

        System.out.print("Enter the number of employees: ");
        int n = input.nextInt();

        for(int i = 1; i <= n; i++){
            System.out.println();
            System.out.println("Employee #" + i + " data");
            System.out.print("Outsource (Y/N)? ");
            char answer = input.next().charAt(0);
            System.out.print("Name: ");
            input.nextLine();
            String name = input.nextLine();
            System.out.print("Hours: ");
            int hours = input.nextInt();
            System.out.print("Value per hour: ");
            double valuePerHour = input.nextDouble();

            if(answer == 'Y' || answer == 'y'){
                System.out.print("Additional charge: ");
                double additionalCharge = input.nextDouble();
                employees.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));
            } else {
                employees.add(new Employee(name, hours, valuePerHour));
            }
        }

        System.out.println();
        System.out.println("Payments!");
        for(Employee employee : employees){
            System.out.println(employee.getName() + ", $" + String.format("%.2f", employee.payment()));
        }

        input.close();
    }
}