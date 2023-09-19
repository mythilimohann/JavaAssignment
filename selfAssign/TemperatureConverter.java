package coreJavaAssignment.selfAssign;

import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        System.out.println("Temperature Conversion");
        System.out.println("**********************");
        System.out.println("Do you want to convert from C to F? Press Y/N");
        Scanner scan = new Scanner(System.in);
        String opt = scan.next();
        if (opt.equalsIgnoreCase("Y")) {
            System.out.println("CONVERTING CELSIUS TO FAHRENHEIT");
            System.out.println("Enter the temperature in celsius: ");
            double c = scan.nextDouble();
            double f = (c*9/5) + 32;
            System.out.println(c+" degree celsius is "+f+" degree fahrenheit");
        } else {
            System.out.println("CONVERTING FAHRENHEIT TO CELSIUS");
            System.out.println("Enter the temperature in Fahrenheit: ");
            double f = scan.nextDouble();
            double c = (f - 32)*5/9;
            System.out.println(f+" degree Fahrenheit is "+c+" degree celsius");
        }
    }
}
