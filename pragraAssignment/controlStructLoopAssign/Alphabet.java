import java.util.Scanner;

public class Alphabet {
    /*
    Write a Java program that requires the user to enter a single character from the alphabet. 
    Print Vowel or Consonant, depending on user input. 
    If the user input is not a letter (between a and z or A and Z), or is a string of length > 1, print an error message.
    example :
    
    Input an alphabet: p
    
    Expected Output:Input letter is Consonant
    */
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an alphabet character: ");
        String alphabet = scan.next();
        char alpha;
        
        if(alphabet.length()>1) {
            System.out.println("Error!!! Please enter only a character(a-z or A-Z) and not a sequence of characters.");
        } else {
            alpha = alphabet.charAt(0);
            int asciiValue = alpha; // Assigns the ascii value of the character to the int variable
            if ((asciiValue>=65 && asciiValue<=90) || (asciiValue>=97 && asciiValue<=122)) { //A-Z 65-90 and a-z 97-122
                String result = (alpha == 'a' || alpha == 'e' || alpha == 'i' || alpha == 'o' || alpha == 'u' ||
                                    alpha == 'A' || alpha == 'E' || alpha == 'I' || alpha == 'O' || alpha == 'U')? "Input letter "+alpha+" is a Vowel" : "Input letter "+alpha+" is a Consonent";
                System.out.println(result);
            } else {
                System.out.println("Error!!! Please enter only a character(a-z or A-Z)");
            }
            
            
        }
    }
}