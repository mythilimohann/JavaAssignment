package coreJavaAssignment.pragraAssignment.controlStructLoopAssign;

import java.util.Scanner;

public class GreatestNumber {
    /*
    Write a Java program that takes three numbers from the user and prints the greatest number. 
    */
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int big=0;
        System.out.println("Enter the first number: ");
        int num1 = scan.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = scan.nextInt();
        System.out.println("Enter the third number: ");
        int num3 = scan.nextInt();
        
        if(num1 >= num2 && num1 >= num3) {
            big = num1;
        } else if(num2 >= num1 && num2 >= num3) {
            big = num2;
        } else if(num3 >= num1 && num3 >= num2) {
            big = num3;
        } 

        System.out.println("Greatest number between "+num1+", "+num2+" and "+num3+" is "+big);
    }
}