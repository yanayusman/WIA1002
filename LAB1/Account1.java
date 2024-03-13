import java.util.*;

public class Account1 {
    private String name;
    private int id = 0;
    private double balance = 0;
    private double annualInterestRate = 0;
    private Date dateCreated;
    private ArrayList<Transaction> transactions = new ArrayList<Transaction>();
    
    public Account1(){
        this.dateCreated = new Date();
    }

    public Account1(int id, double initbalance){
        this.id = id;
        this.balance = initbalance;
        this.dateCreated = new Date();
    }

    public Account1(String name, int id, double initbalance){
        this.name = name;
        this.id = id;
        this.balance = initbalance;
        this.dateCreated = new Date();
    }

    // accessor 
    public String getName(){
        return this.name;
    }

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
    public ArrayList<Transaction> getTransaction(){
        return this.transactions;
    }
    // mutator
    public void setName(String name){
        this.name = name;
    }

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

    public void withdraw(double amt, String description){
        this.balance -= amt;
        transactions.add(new Transaction('W', amt, this.balance, description));
    }

    public void deposit(double amt, String description){
        this.balance += amt;
        transactions.add(new Transaction('D', amt, this.balance, description));
    }
}
