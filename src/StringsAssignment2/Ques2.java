package StringsAssignment2;

/*
 * Created by gaurav on 21/6/17.
 */
/*2. PALINDROME: Write a program that takes an English word and test whether or not this word is a palindrome.
(e.g. a word that reads the same both forwards and backwards such as “level”).*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Ques2 {
    public static void main(String[] args) {
        String str, reverse = "";
        InputStreamReader isr;
        BufferedReader br;
        try {
            isr = new InputStreamReader(System.in);
            br = new BufferedReader(isr);
            System.out.println("Enter a string");
            str = br.readLine();
            for(int i = str.length()-1; i>=0; i--){
                reverse = reverse + str.charAt(i);
            }
            System.out.println(reverse);
            if (str.equals(reverse)) {
                System.out.println("This is Palindrome");
            } else {
                System.out.println("Not a Palindrome");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
