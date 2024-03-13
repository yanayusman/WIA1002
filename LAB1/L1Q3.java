public class L1Q3 {
    public static void main(String[] args) {
        Account acc = new Account(1122, 20000);

        acc.setAnnualInterestRate(4.5);
        acc.withdraw(2500);
        acc.deposit(3000);

        System.out.println("Date : " + acc.getDate());
        System.out.println("ID : " + acc.getId());
        System.out.println("Current Balance : " + acc.getBalance());
        System.out.println("Monthly Interest : " + acc.getMonthlyInterest());
    }
}
