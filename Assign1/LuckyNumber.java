package coreJavaAssignment.Assign1;

import java.util.Scanner;
public class LuckyNumber {
    public static void main(String args[]) {
      System.out.println("GUESS THE LUCKY NUMBER!!!");
      System.out.println("You have 5 chances to guess the correct lucky number.");
      
      Scanner scan = new Scanner(System.in);
      int luckyNum = 25;
      int guess;
      int i;
      String prefix = "";
      for(i=1;i<6;i++) {
          switch (i){
              case 1:
                  prefix = "First";
                  break;
              case 2:
                  prefix = "Second";
                  break;
              case 3:
                  prefix = "Third";
                  break;
              case 4:
                  prefix = "Fourth";
                  break;
              case 5:
                  prefix = "Fifth";
                  break;
          }
          System.out.print(prefix+" chance. Guess the number: ");
          guess = scan.nextInt();
          
          if (luckyNum == guess) {
              System.out.println("Woo-hoooo!!! You won the game!!!");
              break;
          } else {
              continue;
          }
      }
      if (i ==6)
        System.out.println("Alas!! You lost the game :(");
    }
}