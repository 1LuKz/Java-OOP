import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws ParseException {
        Scanner input = new Scanner(System.in);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd/yyyy");
        HourContract hourContract;

        System.out.print("Enter department's name: ");
        String departmentName = input.nextLine();
        System.out.println("Enter worker data");
        System.out.print("Name: ");
        String workerName = input.nextLine();
        System.out.print("Level: ");
        String workerLevel = input.nextLine();
        System.out.print("Base salary: ");
        double baseSalary = input.nextDouble();
        Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Department(departmentName));

        System.out.println();
        System.out.print("How many contracts to this worker? ");
        int n = input.nextInt();;

        for(int i = 1; i <= n; i++){
            System.out.println();
            System.out.println("Enter contract #" + i + " data");
            System.out.print("Date(MM/DD/YYYY): ");
            Date date = simpleDateFormat.parse(input.next());
            System.out.print("Value per hour: ");
            double valuePerHour = input.nextDouble();
            System.out.print("Duration(hours): ");
            int duration = input.nextInt();
            hourContract = new HourContract(date, valuePerHour, duration);
            worker.addContract(hourContract);
        }

        System.out.println();
        System.out.print("Enter month and year to calculate income (MM/YYYY): ");
        String monthAndYear = input.next();
        int month = Integer.parseInt(monthAndYear.substring(0, 2));
        int year = Integer.parseInt(monthAndYear.substring(3));
        System.out.println("Name: " + worker.getName());
        System.out.println("Department: " + worker.getDepartment().getName());
        System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));

        input.close();
    }
}