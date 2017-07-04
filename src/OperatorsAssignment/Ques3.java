/*
 * Created by gaurav.
 */
/*Q3. (Financial application: calculate tips) Write a program that reads the subtotal
and the gratuity rate, then computes the gratuity and total. For example, if the
user enters 10 for subtotal and 15% for gratuity rate, the program displays $1.5
as gratuity and $11.5 as total.*/

package OperatorsAssignment;
import java.util.Scanner;

public class Ques3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double subTotal, gratuity;
        System.out.println("Enter sub total");
        subTotal = sc.nextDouble();
        System.out.println("Enter gratuity rate");
        gratuity = sc.nextDouble();
        double gratuity2 = gratuity/10;
        double subTotal2 = subTotal+gratuity2;
        System.out.println("Sub Total is: $"+subTotal2);
        System.out.println("Gratuity rate is: "+gratuity2+"%");
    }
}
