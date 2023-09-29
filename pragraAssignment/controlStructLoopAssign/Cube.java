package coreJavaAssignment.pragraAssignment.controlStructLoopAssign;

import java.util.Scanner;

public class Cube {
    public static void main(String args[]) {
        System.out.println("Calculate Cube of a number");
        System.out.println("**************************");
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double n = scan.nextDouble();
        double cube = n * n * n;

        System.out.println("Cube of "+n+" is "+cube);

    }
}
