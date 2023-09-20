package coreJavaAssignment.Assign1;

import java.util.Scanner;

public class EvenNumbers {
    public static void main(String[] args) {
        System.out.println("EVEN NUMBERS");
        System.out.println("Enter the limit of the number: ");
        Scanner scan = new Scanner(System.in);
        int limit = scan.nextInt();
        int sum=0;
        for (int i=1; i<=limit; i++){
            if (i%2 != 0) {
                continue;
            }
            System.out.print(i+" ");
            sum += i;
        }
        System.out.println();
        System.out.println("Sum of even numbers in the range between 1 and "+limit+" is "+sum);
    }
}
