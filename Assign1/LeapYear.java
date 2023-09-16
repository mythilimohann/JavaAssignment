package coreJavaAssignment.Assign1;

public class LeapYear {
    public static void main(String[] args) {
        int year = 2010;
        if (year%4 == 0) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }
    }
}
