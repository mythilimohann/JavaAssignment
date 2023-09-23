package coreJavaAssignment.Assign1;

import java.util.Scanner;
public class TemperatureConverter {
    public static void main(String args[]) {
      System.out.println("STARTING TEMPERATURE CONVERTER");
      Scanner scan = new Scanner(System.in);
      int opt;
      for(;;) {
          System.out.println("1. C to F");
          System.out.println("2. F to C");
          System.out.print("Select the option (1 or 2): ");
          opt = scan.nextInt();
          double celsius;
          double fahren;
          if (opt == 1) {
              System.out.print("Enter the celsius value: ");
              celsius = scan.nextDouble();
              fahren = (celsius * 9 /5) + 32;
              System.out.println(celsius + " degree celsius is equivalent to "+fahren+" degree fahrenheit.");
              
          } else if(opt == 2) {
              System.out.print("Enter the fahrenheit value: ");
              fahren = scan.nextDouble();
              celsius = (fahren - 32) * 5 / 9;
              System.out.println(fahren + " degree fahrenheit is equivalent to "+celsius+" degree celsius.");
          } else {
              System.out.println("Incorrect option. Please select option 1 or 2.");
          }
          System.out.print("Do you want to continue? (y/n): ");
          char c = scan.next().charAt(0);
          if(c == 'n' || c == 'N') {
              break;
          } else if(c == 'y' || c == 'Y') {
              continue;
          } else {
              System.out.println("Incorrect option");
              break;
          }
          
      }
      System.out.println("EXITING TEMPERATURE CONVERTER");
    }
}