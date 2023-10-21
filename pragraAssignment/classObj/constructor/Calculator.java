package coreJavaAssignment.pragraAssignment.classObj.constructor;

import java.util.Scanner;

public class Calculator {
    private double num1;
    private double num2;
    private double num3;

    Calculator(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    Calculator(double num1, double num2, double num3) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }

    public double add() {
        return num1 + num2 + num3;
    }

    public double subtract() {
        return num1 - num2;
    }

    public double multiply() {
        return num1 * num2;
    }

    public double divide() {
        return num1 / num2;
    }

    public double modulo() {
        return num1 % num2;
    }

}
