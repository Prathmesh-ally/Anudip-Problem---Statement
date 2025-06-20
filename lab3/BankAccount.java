import java.util.Scanner;

public class BankAccount {
    private String accountHolderName;
    private int accountNumber;
    private int balance;
    public BankAccount(String name, int number, int balance) {
        this.accountHolderName = name;
        this.accountNumber = number;
        this.balance = balance;
    }
    public void deposit(int amount) {
        balance = balance + amount;
    }
    public void withdraw(int amount) {
        balance = balance - amount;
    }
    public int getBalance() {
        return balance;
    }
    public String getAccountHolderName() {
        return accountHolderName;
    }
    public int getAccountNumber() {
        return accountNumber;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Account Holder Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Account Number: ");
        int number = sc.nextInt();
        System.out.print("Enter Initial Balance: ");
        int initialBalance = sc.nextInt();
        BankAccount account = new BankAccount(name, number, initialBalance);
        System.out.print("Enter amount to deposit: ");
        int depositAmount = sc.nextInt();
        account.deposit(depositAmount);
        System.out.print("Enter amount to withdraw: ");
        int withdrawAmount = sc.nextInt();
        account.withdraw(withdrawAmount);
        int currentBalance = account.getBalance();
        String status;
        if (currentBalance >= 5000) {
            status = "Minimum Balance Maintained";
        } else {
            status = "Minimum Balance not Maintained";
        }
        System.out.println("Account Holder: " + account.getAccountHolderName());
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Current Balance: ₹" + currentBalance);
        System.out.println("Status: " + status);

        sc.close();
    }
}
