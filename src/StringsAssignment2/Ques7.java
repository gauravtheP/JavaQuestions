package StringsAssignment2;

import java.util.Arrays;
import java.util.Scanner;

/*
 * Created by gaurav on 21/6/17.
 */
/*7. Write a java program to find the most repeated character in the given string?*/
public class Ques7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String string = sc.next();
        char[] chars = string.toCharArray();
        Arrays.sort(chars);

        String array1 = new String(chars);
        char[] array = array1.toCharArray();

        int count = 1;
        int max = 0;
        char maxChar = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] == array[i - 1]) {
                count++;
            } else {
                if (count > max) {
                    max = count;
                    maxChar = array[i - 1];
                }
                count = 1;
            }
        }
        if (count > max) {
            max = count;
            maxChar = array[array.length - 1];
        }
        System.out.println("Longest run: " + max + ", for the character " + maxChar);
    }
}