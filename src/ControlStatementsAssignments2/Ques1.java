/*
 * Created by gaurav.
 */
/*1. Write a program to find factorial?
Description: Factorial of any number is the product of an integer and all the
integers below it for example factorial of 4 is 4! = 4 * 3 * 2 * 1 = 24. */

package ControlStatementsAssignments2;
import java.util.Scanner;

public class Ques1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int factorial = 1;
        System.out.println("Enter the number");
        int a = sc.nextInt();
        for(int i = a; i>=1; i--){
            factorial = factorial*i;
        }
        System.out.println("Factorial of the number is: "+factorial);
    }
}
