package StringsAssignment2;

import java.util.Scanner;

/*
 * Created by gaurav on 21/6/17.
 */
/*5. Write a java program to remove characters from the first
string which are present in the second string?*/
public class Ques5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First String");
        String str1 = sc.next();
        StringBuilder sb1 = new StringBuilder(str1);

        System.out.println("Enter Second String");
        String str2 = sc.next();
        StringBuilder sb2 = new StringBuilder(str2);

        for(int i = 0; i<sb1.length(); i++){
            for(int j = 0; j<sb2.length(); j++){
                if(sb1.charAt(i) == sb2.charAt(j)){
                    sb1.deleteCharAt(i);
                    i=i-1;
        //Since the deletion of characters is occurring on the same String so i++
        //start the next iteration of loop from next to next character leaving the
        //character in the middle so above i=i-1 compensates for i++ of the loop.
                    break;
                }
            }
        }
        System.out.println(sb1.toString());
    }
}
