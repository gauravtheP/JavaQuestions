/*
 * Created by gaurav.
 */
/*1. Find largest number among three numbers using ternary operator?*/

package ControlStatementsAssignments3;
import java.util.Scanner;

public class Ques1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number");
        double a = sc.nextDouble();
        System.out.println("Enter second Number");
        double b = sc.nextDouble();
        System.out.println("Enter second Number");
        double c = sc.nextDouble();
        double largest = a>(b>c ? b:c) ? a: (b>c ? b:c);
        System.out.println("Largest number is: "+largest);
    }
}

/* Ternary operator states that:
result = testCondition ? value1 : value2
As described in the Oracle documentation, this statement can be read as
“If testCondition is true, assign the value of value1 to result; otherwise,
assign the value of value2 to result.”*/