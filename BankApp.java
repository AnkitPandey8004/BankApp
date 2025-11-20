package ansh.Internship;

import java.util.ArrayList;

class Account {
    private String accountNumber;
    private double balance;
    private ArrayList<String> transactionHistory;

    // Constructor
    public Account(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0.0;
        this.transactionHistory = new ArrayList<>();
        transactionHistory.add("Account created with balance: " + balance);
    }

    // Deposit Method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            transactionHistory.add("Deposited: " + amount + " | New Balance: " + balance);
            System.out.println("Deposit successful!");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Withdraw Method
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
        } 
        else if (amount > balance) {
            System.out.println("Insufficient balance!");
        } 
        else {
            balance -= amount;
            transactionHistory.add("Withdrawn: " + amount + " | New Balance: " + balance);
            System.out.println("Withdrawal successful!");
        }
    }

    // Show Balance
    public double getBalance() {
        return balance;
    }

    // Show Transaction History
    public void printTransactionHistory() {
        System.out.println("\n--- Transaction History ---");
        for (String entry : transactionHistory) {
            System.out.println(entry);
        }
    }
}

// Test the Account class
public class BankApp {
    public static void main(String[] args) {
        Account acc = new Account("AC12345");

        acc.deposit(5000);
        acc.withdraw(2000);
        acc.withdraw(500);
        acc.deposit(1000);

        System.out.println("\nCurrent Balance: " + acc.getBalance());
        acc.printTransactionHistory();
    }
}

    

