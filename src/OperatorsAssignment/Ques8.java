/*
 * Created by gaurav.
 */
/*Q8: (Print a table) Write a program that displays the following table. Cast floating point
numbers into integers.
a               b               pow(a, b)
1               2               1
2               3               8
3               4               81
4               5               1024
5               6               15625s*/
package OperatorsAssignment;
import java.util.Scanner;

public class Ques8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("a\t\t\tb\t\t\tpow(a,b)");
        for(int a = 1; a<=5; a++){
            System.out.println(a+"\t\t\t"+(a+1)+"\t\t\t"+(int)Math.pow(a, a+1));
        }
    }
}
