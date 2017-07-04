/*
 * Created by gaurav.
 */
/*3. Write a java program to swap two variables?*/

package ControlStatementsAssignments1;
import java.util.Scanner;

public class Ques3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a");
        int a = sc.nextInt();
        System.out.println("Enter value of b");
        int b = sc.nextInt();
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Value of a after swap is: "+a);
        System.out.println("Value of b after swap is: "+b);
    }
}
