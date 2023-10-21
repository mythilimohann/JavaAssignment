package coreJavaAssignment.pragraAssignment.strings;

import java.util.Scanner;

public class ReverseWordsInSentence {
    static String[] words;
    static StringBuffer reverseSent=new StringBuffer();
    public static void main(String[] args) {
        System.out.println("Reverse the order of the words");
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sent = scan.nextLine();
        words = sent.split(" ");
        int count = 0;
        String temp;
        for (int i=words.length-1; i>=words.length/2; i-- ) {
            temp = words[count];
            words[count] = words[i];
            words[i] = temp;
            count++;
        }
        for (String wrd: words) {
            System.out.println(wrd);
            reverseSent.append(wrd + " ");
        }
        System.out.println(reverseSent);
    }
}
