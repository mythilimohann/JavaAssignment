package coreJavaAssignment.Assign1;

import java.util.Scanner;
public class CalculatorWithLoop {
    public static void main(String args[]) {
      System.out.println("STARTING CALCULATOR");
      Scanner scan = new Scanner(System.in);
      char c;
      do {
          System.out.println("1. Addition");
          System.out.println("2. Subtraction");
          System.out.println("3. Multiplication");
          System.out.println("4. Division");
          System.out.println("5. Modulo Division");
          
          System.out.print("Select the arithmetic option to perform(1..5): ");
          int option = scan.nextInt();
          if (option >= 1 && option <=5) {
            System.out.print("Enter the first operand: ");
            double a = scan.nextDouble();
            System.out.print("Enter the second operand: ");
            double b = scan.nextDouble();
            double result;
            switch(option){
                case 1:
                    System.out.println("ADDITION");
                    result = a + b;
                    System.out.println("Sum of "+a+" and "+b+" is "+result);
                    break;
                case 2:
                    System.out.println("SUBTRACTION");
                    result = a - b;
                    System.out.println("Difference between "+a+" and "+b+" is "+result);
                    break;
                case 3:
                    System.out.println("MULTIPLICATION");
                    result = a * b;
                    System.out.println(a+" times of "+b+" is "+result);
                    break;
                case 4:
                    System.out.println("DIVISION");
                    result = a / b;
                    System.out.println(a+" divided by "+b+" is "+result);
                    break;
                case 5:
                    System.out.println("MODULO DIVISION");
                    result = a % b;
                    System.out.println("Remider of "+a+" divided by "+b+" is "+result);
                    break;
            }
          }else {
            System.out.println("Incorrect option. Please select the number between 1 and 5.");
          }
          System.out.print("Do you want to exit calculator? (Y/N): ");
          c = scan.next().charAt(0);
          
      } while(c=='y' || c=='Y');
      System.out.println("EXITING CALCULATOR");
    }
}