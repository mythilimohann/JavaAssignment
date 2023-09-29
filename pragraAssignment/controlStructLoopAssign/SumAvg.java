import java.util.Scanner;

public class SumAvg{
    /*
    Write a program in Java to input 5 numbers from the keyboard and find their sum and average.
    */
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Sum and Average of user entered 5 numbers");
        System.out.print("*****************************************");
        System.out.println();
        int i = 1;
        double sum=0;
        double num;
        double avg;
        String ordinal="";
        do {
            switch(i) {
                case 1:
                    ordinal = "First";
                    break;
                case 2:
                    ordinal = "Second";
                    break;
                case 3:
                    ordinal = "Third";
                    break;
                case 4:
                    ordinal = "Fourth";
                    break;
                case 5:
                    ordinal = "Fifth";
                    break;
            }
            System.out.print("Enter the "+ordinal+" number: ");
            num = scan.nextDouble(); 
            sum += num;
            i++;
        } while (i<=5);
        System.out.println("Sum of 5 numbers: "+sum);
        avg = sum / 5;
        System.out.print("Average of 5 numbers: "+avg);
    }
}