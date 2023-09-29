package coreJavaAssignment.pragraAssignment.classObj;

import java.util.Scanner;

public class Calculator {

    public double add(double i, double j){ // method overloading
        double sum = i + j;
        return sum;
    }
    public double add(double i, double j, double k){ // method overloading
        double sum = i + j + k;
        return sum;
    }
    public double subtract(double i, double j){
        double sub = i - j;
        return sub;
    }
    public double multiply(double i, double j){
        double mul = i * j;
        return mul;
    }
    public double divide(double i, double j){
        double div = i / j;
        return div;
    }
    public double modulo(double i, double j){
        double modd = i % j;
        return modd;
    }

    double getInput(String position, Scanner scan) {
        System.out.print("Enter the "+position+" operand: ");
        double num = scan.nextDouble();

        return num;
    }
}
