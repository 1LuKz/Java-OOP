package entities;

public class Account {

    public int numberAccount;
    public String name;
    public double balance;

    public Account(int numberAccount, String name, double balance){
        this.numberAccount = numberAccount;
        this.name = name;
        this.balance = balance;
    }

    public Account(int numberAccount, String name){
        this.numberAccount = numberAccount;
        this.name = name;
        this.balance = 0.0;
    }

    public void depositAccount(double amount){
        balance += amount;
    }

    public void withdrawAccount(double amount){
        balance -= amount + 5.0;
    }

    @Override
    public String toString(){
        return "Account " + numberAccount + ", Holder: " + name + ", Balance: $" + balance;
    }

    public int getNumberAccount() {
        return numberAccount;
    }

    public void setNumberAccount(int numberAccount) {
        this.numberAccount = numberAccount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
