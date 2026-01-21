import entities.Student;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Student student = new Student();

        student.name = input.nextLine();
        student.firstGrade = input.nextDouble();
        student.secondGrade = input.nextDouble();
        student.thirdGrade = input.nextDouble();

        student.totalGrade();

        System.out.println(student.toString());

        input.close();
    }
}