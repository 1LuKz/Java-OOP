import entities.Employeer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        List<Employeer> employees = new ArrayList<>();

        System.out.print("How many employees will be registered? ");
        int n = input.nextInt();

        for(int i = 0; i < n; i++){
            System.out.println();
            System.out.println("Employee #" + i);
            System.out.print("Id: ");
            int id = input.nextInt();

            for (Employeer e : employees) {
                if (e.getId() == id) {
                    throw new RuntimeException("Id already taken!");
                }
            }

            System.out.print("Name: ");
            input.nextLine();
            String name = input.nextLine();
            System.out.print("Salary: ");
            double salary = input.nextDouble();
            employees.add(new Employeer(id, name, salary));
        }

        System.out.println();
        System.out.print("Enter the employee id that will have salary increase: ");
        int id = input.nextInt();

        Employeer employeer = employees.stream().filter(x -> x.getId() == id).findFirst().orElse(null);

        if(employeer != null){
            System.out.print("Enter the percentage: ");
            double percentage = input.nextDouble();
            employeer.increaseSalary(percentage);
        }

        System.out.println();
        System.out.println("List of employees: ");
        for(Employeer e : employees){
            System.out.println(e);
        }

        input.close();
    }
}