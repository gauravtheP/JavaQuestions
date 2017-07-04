/*
 * Created by gaurav.
 */
/*2. Write a program to check the given number is palindrome or not?
Descritpion : A Palindrome number is a number that remains the same when its digits
are reversed. Like 16461, for example: we take 121 and reverse it, after revers it
is same as original number.*/

package ControlStatementsAssignments3;
import java.util.Scanner;

public class Ques2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for checking a palindrome number");
        int number = sc.nextInt();
        int number2 = number;
        int reverse = 0;
            while (number!= 0) {
                reverse = reverse * 10;
                reverse = reverse + number % 10;
                number = number / 10;
            }
            System.out.println("Original number entered is: "+number2);
            System.out.println("Reverse of a number is: "+reverse);
            if(number2 == reverse){
                System.out.println("Number is palindrome");
            }
            else{
                System.out.println("Number is not palindrome");
            }
    }
}
