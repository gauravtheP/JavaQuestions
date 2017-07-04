package StringsAssignment2;

import java.util.Scanner;
import java.util.Arrays;

//Created by gaurav on 21/6/17.

/*6. Write a java program to print all the duplicate characteres in the given string?*/
public class Ques6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String str = sc.next();
        String string = str.toLowerCase();

        char[] chars = string.toCharArray();
        Arrays.sort(chars);
        String sorted = new String(chars);
        char repeated = '0';
        System.out.print("Duplicate Character/s: ");
        for(int i = 0; i<sorted.length(); i++){
            for(int j = i+1; j<sorted.length(); j++){
                if(sorted.charAt(i)==sorted.charAt(j)){
                    if(sorted.charAt(i)!=repeated){
                        System.out.print(sorted.charAt(i)+"  ");
                        repeated = sorted.charAt(i);
                    }
                    break;
                }
            }
        }
    }
}


