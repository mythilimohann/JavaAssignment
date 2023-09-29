package coreJavaAssignment.pragraAssignment.controlStructLoopAssign;

import java.util.Scanner;

public class MultiplicationTables {
    public static void main(String[] args) {
        int count = 1;
        System.out.println("Enter the table number: ");
        Scanner scan = new Scanner(System.in);
        int table = scan.nextInt();
        int mul2;
        do {
            mul2 = table*count;
            System.out.println(count+" * " +table + " = "+mul2);
            count ++;
        } while (count<=10);
    }
}
