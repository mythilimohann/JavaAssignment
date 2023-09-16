package coreJavaAssignment.Assign1;

import java.util.Scanner;

public class CalculatorUsingScanner {
    public static void main(String[] args) {
        System.out.println("Welcome to my calculator");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");
        System.out.println("5. Modulo Division (%)");
        System.out.println("Select the operator: ");
        Scanner s = new Scanner(System.in);
        char input = s.next().charAt(0);
        int result;

        if (input=='+' || input=='-' || input=='*' || input=='/' || input=='%') {
            System.out.println("Enter the first number: ");
            int num1 = s.nextInt();
            System.out.println("Enter the second number: ");
            int num2 = s.nextInt();

            if (input == '+') {
                System.out.println("*** Addition ***");
                result = num1 + num2;
                System.out.println("Sum of " + num1 + " and " + num2 + " is " + result);
            } else if (input == '-') {
                System.out.println("*** Subtraction ***");
                result = num1 - num2;
                System.out.println("Difference between " + num1 + " and " + num2 + " is " + result);
            } else if (input == '*') {
                System.out.println("*** Multiplication ***");
                result = num1 * num2;
                System.out.println(num1 + " times of " + num2 + " is " + result);
            } else if (input == '/') {
                System.out.println("*** Division ***");
                result = num1 / num2;
                System.out.println(num1 + " divided by " + num2 + " is " + result);
            } else if (input == '%') {
                System.out.println("*** Modulo Division ***");
                result = num1 % num2;
                System.out.println("Reminder of "+num1+" divided by "+num2+" is " + result);
            }
        }
        else {
            System.out.println("Invalid operator selected");
        }
    }
}
