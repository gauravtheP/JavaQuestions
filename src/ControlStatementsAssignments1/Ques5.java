/*
 * Created by gaurav.
 */
/*5. Write a program to check the given number is prime or not?*/

package ControlStatementsAssignments1;
import java.util.Scanner;

public class Ques5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = sc.nextInt();
        int b, temp = 0;
        b = a/2;
        for(int i = 2; i<=b; i++){
            if(a % i == 0){
                System.out.println("Number is not prime");
                temp = 1;
                break;
            }
        }
        if(temp == 0){
            System.out.println("Number is prime");
        }
    }
}

