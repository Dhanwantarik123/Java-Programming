import java.util.Scanner;

public class problems13 {
public static class Customer {
    int amount = 10000;

    synchronized void withdraw(int amt) {
        System.out.println("Trying to Withdraw: " + amt);

        if (this.amount < amt) {
            System.out.println("Low Balance... Kindly Deposit Some Amount...");
            try {
                wait(); 
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        this.amount -= amt;
        System.out.println("Withdrawal Successful! New Balance: " + amount);
    }

    synchronized void deposit(int amt) {
        System.out.println("Depositing: " + amt);
        this.amount += amt;
        System.out.println("Deposit Successful! New Balance: " + amount);
        notify();
    }

    synchronized void display() {
        System.out.println("Current Balance: " + amount);
    }
}

    public static void main(String args[]) {
        Customer obj = new Customer();

        Thread T1 = new Thread(new Runnable() {
            public void run() {
                obj.withdraw(20000); 
            }
        });

        Thread T2 = new Thread(new Runnable() {
            public void run() {
                obj.deposit(30000); 
            }
        });

        T1.start();
        T2.start();
    }
}

