import entities.Student;

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Student[] students = new Student[10];

        System.out.print("How many rooms will be rented (1-10)? ");
        int n = input.nextInt();

        for(int i = 1; i <= n; i++){
            System.out.println();
            System.out.println("Rent #" + i);
            System.out.print("Name: ");
            input.nextLine();
            String name = input.nextLine();
            System.out.print("Email: ");
            String email = input.nextLine();
            System.out.print("Room: ");
            int room = input.nextInt();
            students[room] = new Student(name, email);
        }

        System.out.println();
        System.out.println("Busy rooms");
        for(int i = 0; i < students.length; i++){
            if(students[i] != null){
                System.out.println(i + ": " + students[i]);
            }
        }

        input.close();
    }
}