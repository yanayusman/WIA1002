import java.util.*;

public class Account {
    private int id = 0;
    private double balance = 0;
    private double annualInterestRate = 0;
    private Date dateCreated;
    
    public Account(){
        this.dateCreated = new Date();
    }

    public Account(int id, double initbalance){
        this.id = id;
        this.balance = initbalance;
        this.dateCreated = new Date();
    }

    // accessor 
    public int getId(){
        return this.id;
    }

    public double getBalance(){
        return this.balance;
    }

    public double getAnnualInterestRate(){
        return this.annualInterestRate;
    }

    public Date getDate(){
        return this.dateCreated;
    }

    // mutator
    public void setId(int id){
        this.id = id;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public void setAnnualInterestRate(double rate){
        this.annualInterestRate = rate;
    }

    public double getMonthlyInterestRate(){
        return (this.annualInterestRate / 100) / 12;
    }

    public double getMonthlyInterest(){
        return this.balance * this.getMonthlyInterestRate();
    }

    public void withdraw(double amt){
        this.balance -= amt;
    }

    public void deposit(double amt){
        this.balance += amt;
    }
}
