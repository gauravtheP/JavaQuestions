/*
 * Created by gaurav.
 */
/*5. Write a program to Find Largest Number Among Three Numbers
Input three number from user and compare these number with each
others and find largest number among these three numbers. */

package ControlStatementsAssignments2;
import java.util.Scanner;

public class Ques5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number");
        double first = sc.nextDouble();
        System.out.println("Enter second Number");
        double second = sc.nextDouble();
        System.out.println("Enter second Number");
        double third = sc.nextDouble();
        if(first>second && first>third){
            System.out.println("First number is largest");
        }
        if(second>first && second>third){
            System.out.println("Second number is largest");
        }
        if(third>first && third>second){
            System.out.println("Third number is largest");
        }
        if(first==second && second==third){
            System.out.println("All numbers are equal");
        }
    }
}
