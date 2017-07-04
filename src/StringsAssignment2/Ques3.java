package StringsAssignment2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Created by gaurav on 21/6/17.
 */
/*3. Write a java program to reverse a string without using reverse() method?*/
public class Ques3 {
    public static void main(String[] args) {
        String str, reverse = "";
        InputStreamReader isr;
        BufferedReader br;
        try {
            isr = new InputStreamReader(System.in);
            br = new BufferedReader(isr);
            System.out.println("Enter a string");
            str = br.readLine();
            for (int i = str.length() - 1; i >= 0; i--) {
                reverse = reverse + str.charAt(i);
            }
            System.out.println("Reverse: "+reverse);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
