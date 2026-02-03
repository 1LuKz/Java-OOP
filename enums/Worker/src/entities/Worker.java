package entities;

import entities.enums.WorkerLevel;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Worker {
    private String name;
    private WorkerLevel level;
    private double baseSalary;

    private Department department;
    private List<HourContract> hourContracts = new ArrayList<>();

    public Worker(){
    }

    public Worker(String name, WorkerLevel level, double baseSalary, Department department){
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public List<HourContract> getHourContracts() {
        return hourContracts;
    }

    public void setHourContracts(List<HourContract> hourContracts) {
        this.hourContracts = hourContracts;
    }

    public void addContract(HourContract contract){
        hourContracts.add(contract);
    }

    public void removeContract(HourContract contract){
        hourContracts.remove(contract);
    }

    public double income(int year, int month){
        double sum = baseSalary;
        Calendar calendar = Calendar.getInstance();
        for(HourContract contract : hourContracts){
            calendar.setTime(contract.getDate());
            int calendar_year = calendar.get(Calendar.YEAR);
            int calendar_month = 1 + calendar.get(Calendar.MONTH);
            if(year == calendar_year && month == calendar_month){
                sum += contract.totalValue();
            }
        }
        return sum;
    }
}
