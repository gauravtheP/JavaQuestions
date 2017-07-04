package StringsAssignment2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
 * Created by gaurav on 21/6/17.
 */
/*1. Write a Java program that counts vowels in a string?*/

public class Ques1 {
    public static void main(String[] args) {
        int count = 0;
        InputStreamReader isr;
        BufferedReader br;
        try {
            isr = new InputStreamReader(System.in);
            br = new BufferedReader(isr);
            System.out.println("Enter a string");
            String str = br.readLine();
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
                    count++;
                }
            }
            System.out.println("Number of vowels in this string is: " + count);
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
