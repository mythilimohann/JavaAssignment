package coreJavaAssignment.pragraAssignment.classObj.constructor;

import java.util.Scanner;

public class MainCalculator {

    static double getInput(String position, Scanner scan) {
        System.out.print("Enter the " + position + " operand: ");
        double num = scan.nextDouble();

        return num;
    }

    public static void main(String[] args) {
        System.out.println("Calculator");
        System.out.println("**********");
        Scanner scan = new Scanner(System.in);
        int option;
        double num1, num2, num3, result;
        String cont;

        do {
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Modulo division");
            System.out.print("Select the option(1..5): ");
            option = scan.nextInt();
            String contOperation;

            int isValid = (option >= 1 && option <= 5) ? 1 : 0; // ternary operator
            if (isValid == 1) {
                switch (option) {
                    case 1:
                        do {
                            System.out.println("WELCOME TO ADDITION");
                            System.out.print("Do you want to add 2 or 3 numbers? ");
                            int count = scan.nextInt();
                            if (count == 2) {
                                num1 = MainCalculator.getInput("first", scan);
                                num2 = MainCalculator.getInput("second", scan);
                                Calculator calc = new Calculator(num1, num2);
                                result = calc.add();
                                System.out.println("Sum of " + num1 + " and " + num2 + " is " + result);
                            } else if (count == 3) {
                                num1 = MainCalculator.getInput("first", scan);
                                num2 = MainCalculator.getInput("second", scan);
                                num3 = MainCalculator.getInput("third", scan);
                                Calculator calc = new Calculator(num1, num2, num3);
                                result = calc.add();
                                System.out.println("Sum of " + num1 + ", " + num2 + " and " + num3 + " is " + result);
                            } else {
                                System.out.println("Invalid input");
                            }
                            System.out.print("Do want to continue with adding more numbers?(Y or N): ");
                            contOperation = scan.next();
                        } while (contOperation.equalsIgnoreCase("y"));
                        break;
                    case 2:
                        while (true) {
                            System.out.println("WELCOME TO SUBTRACTION");
                            num1 = MainCalculator.getInput("first", scan);
                            num2 = MainCalculator.getInput("second", scan);
                            Calculator calc = new Calculator(num1, num2);
                            result = calc.subtract();
                            System.out.println("Difference between " + num1 + " and " + num2 + " is " + result);

                            System.out.print("Do want to continue with subtraction of more numbers?(Y or N): ");
                            contOperation = scan.next();
                            if (contOperation.equalsIgnoreCase("y")) {
                                continue;
                            } else {
                                break;
                            }
                        }
                        break;
                    case 3:
                        do {
                            System.out.println("WELCOME TO MULTIPLICATION");
                            num1 = MainCalculator.getInput("first", scan);
                            num2 = MainCalculator.getInput("second", scan);
                            Calculator calc = new Calculator(num1, num2);
                            result = calc.multiply();
                            System.out.println(num1 + " times of " + num2 + " is " + result);

                            System.out.print("Do want to continue with multiplication of more numbers?(Y or N): ");
                            contOperation = scan.next();
                        } while (contOperation.equalsIgnoreCase("y"));
                        break;
                    case 4:
                        do {
                            System.out.println("WELCOME TO DIVISION");
                            num1 = MainCalculator.getInput("first", scan);
                            num2 = MainCalculator.getInput("second", scan);
                            Calculator calc = new Calculator(num1, num2);
                            result = calc.divide();
                            System.out.println(num1 + " divided by " + num2 + " is " + result);

                            System.out.print("Do want to continue with division of more numbers?(Y or N): ");
                            contOperation = scan.next();
                        } while (contOperation.equalsIgnoreCase("y"));
                        break;
                    case 5:
                        do {
                            System.out.println("WELCOME TO MODULO DIVISION");
                            num1 = MainCalculator.getInput("first", scan);
                            num2 = MainCalculator.getInput("second", scan);
                            Calculator calc = new Calculator(num1, num2);
                            result = calc.modulo();
                            System.out.println("Reminder from " + num1 + " divided by " + num2 + " is " + result);

                            System.out.print("Do want to continue with modulo division of more numbers?(Y or N): ");
                            contOperation = scan.next();
                        } while (contOperation.equalsIgnoreCase("y"));
                        break;
                }
            } else {
                System.out.println("Incorrect option selected");
            }
            System.out.print("Do you want to go back to main menu? (Y/N): ");
            cont = scan.next();
        } while (cont.equalsIgnoreCase("Y"));
    }
}
