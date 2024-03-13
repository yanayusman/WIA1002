public class L1Q4 {
    public static void main(String[] args) {
        Account1 acc = new Account1("George", 1122, 1000);

        acc.setAnnualInterestRate(1.5);
        acc.deposit(30, "Deposit 1");
        acc.deposit(40, "Deposit 2");
        acc.deposit(50, "Deposit 3");
        acc.withdraw(5, "Withdraw 1");
        acc.withdraw(4, "Withdraw 2");
        acc.withdraw(2, "Withdraw 3");

        System.out.println("Date : " + acc.getDate());
        System.out.println("Account Holder : " + acc.getName());
        System.out.println("Interest Rate : " + acc.getAnnualInterestRate());
        System.out.println("Current Balance : " + acc.getBalance());
        System.out.println("\nTransactions : ");
        for(Transaction transaction : acc.getTransaction()){
            System.out.println("Date : " + transaction.getDate());
            System.out.println("Type : " + transaction.getType());
            System.out.println("Amount : " + transaction.getAmount());
            System.out.println("Balance : " + transaction.getBalance());
            System.out.println("Description : " + transaction.getDescription() + "\n");
        }
    }
}
