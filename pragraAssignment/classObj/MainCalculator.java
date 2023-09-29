package coreJavaAssignment.pragraAssignment.classObj;

import java.util.Scanner;

public class MainCalculator {
    public static void main(String[] args) {
        System.out.println("Calculator");
        System.out.println("**********");
        Calculator c = new Calculator();
        Scanner scan = new Scanner(System.in);
        char cont;
        int option;
        int isValid;
        double result;
        double num1;
        double num2;
        double num3;

        do {
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Modulo division");
            System.out.print("Select the option(1..5): ");
            option = scan.nextInt();

            isValid = (option>=1 && option<=5)?1:0; // ternary operator

            if (isValid == 1) {
                switch (option) {
                    case 1:
                        do {
                            System.out.println("WELCOME TO ADDITION");
                            System.out.print("Do you want to add 2 or 3 numbers? ");
                            int count = scan.nextInt();
                            if (count == 2) {
                                num1 = c.getInput("first", scan);
                                num2 = c.getInput("second", scan);
                                result = c.add(num1, num2);
                                System.out.println("Sum of " + num1 + " and " + num2 + " is " + result);
                            } else if (count == 3) {
                                num1 = c.getInput("first", scan);
                                num2 = c.getInput("second", scan);
                                num3 = c.getInput("third", scan);
                                result = c.add(num1, num2, num3);
                                System.out.println("Sum of " + num1 + ", " + num2 + " and " + num3 + " is " + result);
                            }
                            System.out.print("Do want to continue with adding more numbers?(Y or N): ");
                            option = scan.next().charAt(0);
                        } while(option=='y' || option=='Y');
                        break;
                    case 2:
                        while(true) {
                            System.out.println("WELCOME TO SUBTRACTION");
                            num1 = c.getInput("first", scan);
                            num2 = c.getInput("second", scan);
                            result = c.subtract(num1, num2);
                            System.out.println("Difference between " + num1 + " and " + num2 + " is " + result);

                            System.out.print("Do want to continue with subtraction of more numbers?(Y or N): ");
                            option = scan.next().charAt(0);
                            if (option=='y' || option=='Y'){
                                continue;
                            } else {
                                break;
                            }
                        }
                        break;
                    case 3:
                        do {
                            System.out.println("WELCOME TO MULTIPLICATION");
                            num1 = c.getInput("first", scan);
                            num2 = c.getInput("second", scan);
                            result = c.multiply(num1, num2);
                            System.out.println(num1 + " times of " + num2 + " is " + result);

                            System.out.print("Do want to continue with multiplication of more numbers?(Y or N): ");
                            option = scan.next().charAt(0);
                        } while(option=='y' || option=='Y');
                        break;
                    case 4:
                        do {
                            System.out.println("WELCOME TO DIVISION");
                            num1 = c.getInput("first", scan);
                            num2 = c.getInput("second", scan);
                            result = c.divide(num1, num2);
                            System.out.println(num1 + " divided by " + num2 + " is " + result);

                            System.out.print("Do want to continue with division of more numbers?(Y or N): ");
                            option = scan.next().charAt(0);
                        } while(option=='y' || option=='Y');
                        break;
                    case 5:
                        do {
                            System.out.println("WELCOME TO MODULO DIVISION");
                            num1 = c.getInput("first", scan);
                            num2 = c.getInput("second", scan);
                            result = c.modulo(num1, num2);
                            System.out.println("Reminder from "+num1 + " divided by " + num2 + " is " + result);

                            System.out.print("Do want to continue with modulo division of more numbers?(Y or N): ");
                            option = scan.next().charAt(0);
                        } while(option=='y' || option=='Y');
                        break;
                }
            } else {
                System.out.println("Incorrect option selected");
            }
            System.out.print("Do you want to go back to main menu? (Y/N): ");
            cont = scan.next().charAt(0);
        } while (cont == 'Y' || cont == 'y');
    }
}
