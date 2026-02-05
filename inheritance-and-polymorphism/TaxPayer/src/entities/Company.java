package entities;

public class Company extends TaxPayer{
    private int numberOfEmployer;

    public Company(){
        super();
    }

    public Company(String name, double annualIncome, int numberOfEmployer){
        super(name, annualIncome);
        this.numberOfEmployer = numberOfEmployer;
    }

    public int getNumberOfEmployer() {
        return numberOfEmployer;
    }

    public void setNumberOfEmployer(int numberOfEmployer) {
        this.numberOfEmployer = numberOfEmployer;
    }

    @Override
    public double tax(){
        if(numberOfEmployer > 10){
            return getAnnualIncome() * 0.14;
        } else {
            return getAnnualIncome() * 0.16;
        }
    }
}
