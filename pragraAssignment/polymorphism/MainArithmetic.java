package coreJavaAssignment.pragraAssignment.polymorphism;

public class MainArithmetic {
    public static void main(String[] args) {
        int num1 = 42;
        int num2 = 13;
        Adder adder = new Adder();
        System.out.println(num1 + " " + num2 + " " +adder.add(42, 13));
    }
}
