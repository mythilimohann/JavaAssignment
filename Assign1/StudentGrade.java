package coreJavaAssignment.Assign1;

public class StudentGrade {
    public static void main(String[] args) {
        int mark = 100;
        if (mark >= 0 && mark < 40) {
            System.out.println("Fail");
        }
        else if(mark>=40 && mark<60) {
            System.out.println("B grade");
        }
        else if(mark>=60 && mark<80){
            System.out.println("B+ grade");
        } else if (mark>=80 && mark<90) {
            System.out.println("A grade");
        } else if (mark>=90 && mark<=99) {
            System.out.println("A+ grade");
        } else if (mark==100) {
            System.out.println("You are an Alien!!!");
        } else {
            System.out.println("Mark is not valid");
        }
    }
}
