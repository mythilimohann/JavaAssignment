package coreJavaAssignment.selfAssign;
import java.util.Scanner;

public class CADCurrencyConversion {
    public static void main(String[] args) {
        System.out.println("Currency Conversion - Canadian Dollar (CAD)");
        System.out.println("*******************************************");
        System.out.println("USD - US Dollar");
        System.out.println("INR - Indian Rupees");
        System.out.println("EUR - Euro");
        System.out.println("CHF - Swiss Franc");
        System.out.println("SGD - Singapore Dollar");
        System.out.println("AUD - Australian Dollar");
        System.out.println("RUB - Russian Rouble");
        System.out.println("JPY - Japanese Yen");
        System.out.println("KWD - Kuwait Dinar");
        System.out.println("CNY - Chinese Yuan");
        System.out.println("Select the currency to convert from CAD: ");
        Scanner scan = new Scanner(System.in);
        String currency = scan.next();
        double convertedVal;
        double val2Convert;

        if (currency.equalsIgnoreCase("USD")) {
            System.out.println("Enter the currency value in CAD: ");
            val2Convert = scan.nextInt();
            System.out.println("1 CAD is 0.75 USD");
            convertedVal = val2Convert * 0.75;
            System.out.println(val2Convert+" CAD is "+convertedVal+" USD");
        } else if (currency.equalsIgnoreCase("INR")) {
            System.out.println("Enter the currency value in CAD: ");
            val2Convert = scan.nextInt();
            System.out.println("1 CAD is 62.08 INR");
            convertedVal = val2Convert * 62.08;
            System.out.println(val2Convert+" CAD is "+convertedVal+" INR");
        }else if (currency.equalsIgnoreCase("EUR")) {
            System.out.println("Enter the currency value in CAD: ");
            val2Convert = scan.nextInt();
            System.out.println("1 CAD is 0.70 EUR");
            convertedVal = val2Convert * 0.7;
            System.out.println(val2Convert+" CAD is "+convertedVal+" EUR");
        }else if (currency.equalsIgnoreCase("CHF")) {
            System.out.println("Enter the currency value in CAD: ");
            val2Convert = scan.nextInt();
            System.out.println("1 CAD is 0.67 CHF");
            convertedVal = val2Convert * 0.67;
            System.out.println(val2Convert+" CAD is "+convertedVal+" CHF");
        }else if (currency.equalsIgnoreCase("SGD")) {
            System.out.println("Enter the currency value in CAD: ");
            val2Convert = scan.nextInt();
            System.out.println("1 CAD is 1.02 SGD");
            convertedVal = val2Convert * 1.02;
            System.out.println(val2Convert+" CAD is "+convertedVal+" SGD");
        }else if (currency.equalsIgnoreCase("AUD")) {
            System.out.println("Enter the currency value in CAD: ");
            val2Convert = scan.nextInt();
            System.out.println("1 CAD is 1.15 AUD");
            convertedVal = val2Convert * 1.15;
            System.out.println(val2Convert+" CAD is "+convertedVal+" AUD");
        }else if (currency.equalsIgnoreCase("RUB")) {
            System.out.println("Enter the currency value in CAD: ");
            val2Convert = scan.nextInt();
            System.out.println("1 CAD is 71.79 RUB");
            convertedVal = val2Convert * 71.79;
            System.out.println(val2Convert+" CAD is "+convertedVal+" RUB");
        }else if (currency.equalsIgnoreCase("JPY")) {
            System.out.println("Enter the currency value in CAD: ");
            val2Convert = scan.nextInt();
            System.out.println("1 CAD is 110.07 JPY");
            convertedVal = val2Convert * 110.07;
            System.out.println(val2Convert+" CAD is "+convertedVal+" JPY");
        }else if (currency.equalsIgnoreCase("KWD")) {
            System.out.println("Enter the currency value in CAD: ");
            val2Convert = scan.nextInt();
            System.out.println("1 CAD is 0.23 KWD");
            convertedVal = val2Convert * 0.23;
            System.out.println(val2Convert+" CAD is "+convertedVal+" KWD");
        }else if (currency.equalsIgnoreCase("CNY")) {
            System.out.println("Enter the currency value in CAD: ");
            val2Convert = scan.nextInt();
            System.out.println("1 CAD is 5.44 CNY");
            convertedVal = val2Convert * 5.44;
            System.out.println(val2Convert+" CAD is "+convertedVal+" CNY");
        }else {
            System.out.println("Incorrect currency. Please select the currency from the list.");
        }
    }
}
