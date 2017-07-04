package StringsAssignment2;

import java.util.Arrays;
import java.util.Scanner;

/*
 * Created by gaurav on 21/6/17.
 */
/*10. Write a java program to sort the given string?
	Example: input : ravindra
			 output : aadinrrv*/
public class Ques10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String str = sc.next();
        String string = str.toLowerCase();

        char[] chars = string.toCharArray();
        Arrays.sort(chars);
        String sorted = new String(chars);
        System.out.println("Reverse: "+sorted);
    }
}
