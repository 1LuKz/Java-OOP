package entities;

public class Student {
    public String name;
    public double firstGrade;
    public double secondGrade;
    public double thirdGrade;

    public double totalGrade(){
        if(firstGrade > 30 || firstGrade < 0){
            throw new RuntimeException("First grade invalid");
        } else if (secondGrade > 35 || secondGrade < 0 || thirdGrade > 35 || thirdGrade < 0) {
            System.out.println(" ");
            throw new RuntimeException("Second grande or third grande invalid");
        }
        return firstGrade + secondGrade + thirdGrade;
    }

    public String finalGrade(){
        if(totalGrade() > 60){
            return " PASS";
        } else {
            return ", FAILED MISSING: " + (60 - totalGrade()) + " POINTS";
        }
    }

    @Override
    public String toString(){
        return "TOTAL GRADE: " + totalGrade() + finalGrade();
    }
}
