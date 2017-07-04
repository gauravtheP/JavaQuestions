/*
 * Created by gaurav.
 */
/*4.Write a program to check given number is Armstrong number or not?
Description: Armstrong number is a number that is the sum of its own digits
each raised to the power of the number of digits is equal to the number itself.
For example: 
Three Digits Armstrong number is 153, 1 ^ 3 + 5 ^ 3 + 3 ^ 3 = 153 
Four Digits Armstrong number is 1634, 1 ^ 4 + 6 ^ 4 + 3 ^ 4 + 4 ^ 4 + = 1634 */

package ControlStatementsAssignments2;
import java.util.Scanner;

public class Ques4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number,n=0, reminder,result = 0;
        System.out.println("Enter the number for checking Armstrong number");
        int originalNumber = sc.nextInt();
        number = originalNumber;
        while(number!=0){
        number/=10;
        n++;
    }
    number = originalNumber;
    while(number!=0){
        reminder = number % 10;
        result+=(int)Math.pow(reminder, n);
        number/=10;
    }
    if(originalNumber==result) {
        System.out.println("Armstrong Number\n");
    }
    else{
        System.out.println("Not an Armstrong Number\n");
    }
    }
}
