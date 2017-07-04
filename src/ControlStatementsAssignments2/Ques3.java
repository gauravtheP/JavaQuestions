/*
 * Created by gaurav.
 */
/*3. Write a program to print Fibonacci Series?
Description : Fibonacci series is in the form of 0, 1, 1, 2, 3, 5, 8, 13, 21,......
Hint: To find this series we add two previous terms/digits and get next
term/number */

package ControlStatementsAssignments2;
import java.util.Scanner;

public class Ques3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("How many Fibonacci Series numbers you want to print");
        int n = sc.nextInt();
        int last = 0;
        int previous = 1;
        System.out.print("Fibonacci Series is: "+last+",\t"+previous+",\t");
        for(int i = 0; i<n-2; i++){
            int next = last+previous;
            System.out.print(next+",\t");
            last = previous;
            previous = next;
        }
        System.out.print("...");
    }
}
