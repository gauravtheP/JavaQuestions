/*
 * Created by gaurav.
 */
/*4. Write a program to Swap two numbers without using third variable?*/

package ControlStatementsAssignments1;
import java.util.Scanner;

public class Ques4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a");
        int a = sc.nextInt();
        System.out.println("Enter value of b");
        int b = sc.nextInt();
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("Value of a after swap is: "+a);
        System.out.println("Value of b after swap is: "+b);
    }
}
