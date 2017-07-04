/*
 * Created by gaurav.
 */
/*
Q4. (Sum the digits in an integer) Write a program that reads an integer between 0 and
1000 and adds all the digits in the integer. For example, if an integer is 932, the
sum of all its digits is 14.
Hint: Use the % operator to extract digits, and use the / operator to remove the
extracted digit. For instance, 932 % 10 = 2 and 932 / 10 = 93*/

package OperatorsAssignment;
import java.util.Scanner;
public class Ques4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any integer (range 1 to 999)");
        int digit1 = sc.nextInt();
        int sum;
        int digit2;
        int digit3;
        if(digit1>=1 && digit1<=9){
            System.out.println("Sum of digit is: "+digit1);
        }
        if(digit1>=10 && digit1<=99){
            digit2 = digit1 % 10;
            digit3 = digit1 / 10;
            sum = digit2 + digit3;
            System.out.println("Sum of digit is: "+sum);
        }
        if(digit1>=100 && digit1<=999){
            int ones = digit1 % 10;
            int temp = digit1 / 10;
            int tens = temp % 10;
            int hundreds = temp / 10;
            sum = ones + tens + hundreds;
            System.out.println("Sum of digit is: "+sum);
        }
        if(digit1<1 || digit1>999){
            System.out.println("Number is out of range");
        }
    }
}
