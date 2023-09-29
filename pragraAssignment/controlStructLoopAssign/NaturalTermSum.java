import java.util.Scanner;

public class NaturalTermSum{
    /*
    Write a Java program to display n terms of natural numbers and their sum.
    */
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the value of term: ");
        int n = scan.nextInt();
        int sum=0;
        
        System.out.println("Printing the first "+n+" natural numbers");
        for(int i=1; i<=n; i++) {
            System.out.print(i + " ");
            sum += i;
        }
        System.out.println();
        System.out.println("Sum of the first "+n+" natural numbers: "+sum);
    }
}