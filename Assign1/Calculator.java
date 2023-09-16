package coreJavaAssignment.Assign1;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Welcome to my calculator");
        char input = '%';
        int i;
        int j;
        if (input == '+') {
            System.out.printf("***Addition***");
            i = 10;
            j = 20;
            int sum = i+j;
            System.out.println("Sum of i and j: "+sum);
        } else if (input =='-') {
            System.out.printf("***Subtraction***");
            i=33;
            j=10;
            int diff = i-j;
            System.out.println("Subtracting j from i: "+diff);
        } else if (input == '*') {
            System.out.println("***Multiplication***");
            i = 10;
            j = 5;
            int mul = i*j;
            System.out.println("i times j is "+mul);
        } else if(input=='/'){
            System.out.println("***Division***");
            i = 10;
            j = 5;
            int div = i/j;
            System.out.println("i divided by j: "+div);
        } else if (input == '%') {
            System.out.println("***Modulo Division***");
            i = 10;
            j = 5;
            int reminder = i%j;
            System.out.println("Reminder of i divided by j: "+reminder);
        }
    }
}
