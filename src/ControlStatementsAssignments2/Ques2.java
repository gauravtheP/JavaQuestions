/*
 * Created by gaurav.
 */
/*2. Write a program to reverse number?
Description : Reverse number means reverse the position of all digits of any number.
For example reverse of 839 is 938.
Hint: For this program you need modulus operator concept and while loop,
while loop is used for check condition and modulus used for find the remainder.*/

package ControlStatementsAssignments2;
import java.util.Scanner;

public class Ques2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch;
        do {
            System.out.println("Enter any integer (range 10 to 999)");
            int number1 = sc.nextInt();
            if (number1 >= 10 && number1 <= 99) {
                int number2 = number1 % 10;
                int number3 = number1 / 10;
                System.out.println("Reverse of the number is: " + number2 + number3);
            }
            if (number1 >= 100 && number1 <= 999) {
                int units = number1 % 10;
                int temp = number1 / 10;
                int tens = temp % 10;
                int hundreds = temp / 10;
                System.out.println("Reverse of the number is: " + units + tens + hundreds);
            }
            if (number1 < 10 || number1 > 999) {
                System.out.println("Number is out of range");
            }
            System.out.println("Do you want to do more transaction: Y or N");
            ch = sc.next().charAt(0);       //this will take first character only
        }   while(ch=='Y'||ch=='y');
    }
}

