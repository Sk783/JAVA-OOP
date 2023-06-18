package BankManagementSystem;

import java.lang.reflect.AccessibleObject;
import java.sql.Savepoint;

    public class BankAccount {
        String accountNumber;
        double balance;

        public BankAccount(String accountNumber, double balance) {
            this.accountNumber = accountNumber;
            this.balance = balance;
        }

        public void deposit(double amount) {
            balance += amount;
        }

        public void withdraw(double amount) {
            if (balance >= amount) {
                balance -= amount;
            } else {
                System.out.println("!!!Insufficient Balance!!!");
            }
        }

        public double getBalance() {
            return balance;
        }

        static class savingsAccount extends BankAccount {
            public savingsAccount(String accountNumber, double balance) {
                super(accountNumber, balance);
            }

            @Override
            public void withdraw(double amount) {
                if (getBalance() - amount < 100) {
                    System.out.println("Minimum balance of 100 required!");
                } else {
                    super.withdraw(amount);
                }
            }
        }

        public static void main(String[] args) {
            //Bank account naming BA764829 with initial balance of Rs 500
            System.out.println("Making a bank account A/C BA764829 with an initial balance of Rs 500");
            BankAccount BA764829 = new BankAccount("BA764829", 500);

            System.out.println("Deposite Rs 3500 into account BA764829");
            BA764829.deposit(3500);

            System.out.println("Withdraw Rs 600 from account BA764829");
            BA764829.withdraw(600);

            System.out.println("New balance after withdrawing Rs 600: "+BA764829.getBalance());

            //Creating a savings account (A/C SV879593) with initial balance Rs. 770
            System.out.println("\nMaking a savings account A/C SV879593 with an initial balance of Rs 770");
            savingsAccount SV879593 = new savingsAccount("SV879593", 770);

            SV879593.withdraw(500);
            System.out.println("Balance after withdrawal of Rs 500 from the initial amount: "+SV879593.getBalance());
        }
    }
