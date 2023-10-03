package coreJavaAssignment.pragraAssignment.classObj;

import java.util.Scanner;
class MyBank {
    double balance;
    int depositTransaction;
    int withdrawTransaction;
    double depositAmount;
    double withdrawalAmount;
    {
        balance = 1000;
    }
    public void checkBalance() {
        System.out.println("Checking Account Balance"); 
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
        
        System.out.println("Available Current Balance: "+balance);  
    }
    public void deposit(Scanner scan) {
        System.out.println("Deposit"); 
        System.out.println("~~~~~~~");
        System.out.print("Enter the amount to deposit: ");
        double amt = scan.nextDouble();
                    
        if(amt <= 0) {
            System.out.print("Invalid amount entered. Please enter a valid amount to deposit.");
        } else {
            depositTransaction++;
            depositAmount += amt;
            balance += amt;
            System.out.println("Amount deposited: "+amt);
            System.out.println("Available Balance: "+balance); 
        } 
    }
    public void withdraw(Scanner scan) {
        System.out.println("Withdraw"); 
        System.out.println("~~~~~~~~");
        System.out.print("Enter the amount to withdraw: ");
        double amt = scan.nextDouble();
                    
        if(amt <= 0) {
            System.out.print("Invalid amount entered. Please enter a valid amount to withdraw.");
        } else {
            if (amt <= balance) {
                withdrawalAmount += amt;
                balance -= amt;
                withdrawTransaction++;
                System.out.println("Amount withdrawn: "+amt);
                System.out.println("Available Balance: "+balance); 
            } else {
                System.out.println("You do not have sufficient balance to withdraw. Total available balance: "+balance); 
            }
        } 
        
        
    }
    public void accSummary() {
        System.out.println("Account Summary"); 
        System.out.println("~~~~~~~~~~~~~~~");
        System.out.println("Current balance: "+balance);
        System.out.println("Number of deposits: "+depositTransaction);
        System.out.println("Total amount deposited: "+depositAmount);
        System.out.println("Number of withdraws: "+withdrawTransaction);
        System.out.println("Total amount withdrew: "+withdrawalAmount);
        
    }
}