package coreJavaAssignment.pragraAssignment.classObj;

import java.util.Scanner;

public class MainBank {
    
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        MyBank acc = new MyBank();
        char cont;
        do {
            System.out.println("Banking System Simulator");
            System.out.println("************************");
            System.out.println("a. Account Balance");
            System.out.println("b. Deposit");
            System.out.println("c. Withdraw");
            System.out.println("d. Account Summary");
            System.out.println("e. Exit");
            System.out.print("Please select the option (a..e): ");
            char input = scan.next().charAt(0);
            int asciiInput = input;
            
            if ((asciiInput >= 97 && asciiInput <= 101) || (asciiInput >= 65 && asciiInput <= 69)) {
                if (input == 'a' || input == 'A') {
                    acc.checkBalance();
                } else if (input == 'b' || input == 'B') {
                    acc.deposit(scan);
                } else if (input == 'c' || input == 'C') {
                    acc.withdraw(scan);
                } else if (input == 'd' || input == 'D') {
                    acc.accSummary();
                } else if (input == 'e' || input == 'E') {
                    System.out.println("Exit");
                    break;
                } 
            } else {
                System.out.println("Invalid Input");
            }
            System.out.print("Do you want to continue banking? (Y/N) :: ");
            cont = scan.next().charAt(0);
        } while (cont == 'y' || cont == 'Y');
        
    }
    
}
