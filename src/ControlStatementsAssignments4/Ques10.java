package ControlStatementsAssignments4;
import java.util.Scanner;
/*
 * Created by gaurav.
 */
/*Q10. (Find the factors of an integer) Write a program that reads an integer and displays
all its smallest factors in increasing order. For example, if the input integer is
120, the output should be as follows: 2, 2, 2, 3, 5.*/
public class Ques10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();
        int divider = 2;
        System.out.println("Factors of a number are: ");
        while(number!=1){
            if(number%divider == 0){
                int temp = number/divider;
                System.out.print(divider+" ");
                number = temp;
            }
            else{
                divider = divider+1;
            }
        }
    }
}
