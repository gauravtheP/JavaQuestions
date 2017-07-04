/*
 * Created by gaurav.
 */
/*3. Write a program to print star pattern?
Input n= 5;
Output:
        *
       * *
      * * *
     * * * *
    * * * * *
*/
package ControlStatementsAssignments3;
import java.util.Scanner;
public class Ques3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("How many rows of star pattern you want to print");
        int n = sc.nextInt();
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n-i; j++){
                System.out.print(" ");
            }
            for(int k=0; k<=i; k++) {
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
