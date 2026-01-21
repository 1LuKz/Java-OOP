package entities;

public class Employee {
    public String name;
    public double grossSalary;
    public double tax;

    public double netSalary(){
        return grossSalary - tax;
    }

    public void increaseSalary(double percentage){
        grossSalary = (1 + percentage / 100) * grossSalary;
    }

    @Override
    public String toString(){
        return String.format("Employee: %s, $%.1f", name, netSalary());
    }
}
