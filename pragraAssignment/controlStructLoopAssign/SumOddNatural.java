package coreJavaAssignment.pragraAssignment.controlStructLoopAssign;

import java.util.Scanner;

public class SumOddNatural {
    public static void main(String []args) {
        System.out.println("Sum of odd natural numbers");
        System.out.println("**************************");
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the count: ");
        int input = scan.nextInt();
        int count = 1;
        int oddNum = 1;
        int sum = 0;
        System.out.print("First "+input+" odd numbers are ");
        while(count <= input) {
            System.out.print(oddNum + " ");
            sum += oddNum;
            oddNum += 2;
            count++;
        }
        System.out.println();
        System.out.println("Sum of first "+input+" natural odd numbers: "+sum);
    }
}
