/*
 * Created by gaurav.
 */
/*2. Write a program to find given number is odd or even?*/

package ControlStatementsAssignments1;
import java.util.Scanner;

public class Ques2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int a = sc.nextInt();
        if(a % 2 == 0){
            System.out.println("Number is even");
        }
        else{
            System.out.println("Number is odd");
        }
    }
}
