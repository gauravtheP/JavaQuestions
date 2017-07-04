/*
 * Created by gaurav.
 */
/*1. Write a program to find sum of two numbers?*/

package ControlStatementsAssignments1;
import java.util.Scanner;

public class Ques1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double sum = a+b;
        System.out.println("Sum is: "+sum);
    }
}
