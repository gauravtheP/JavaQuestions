/*
 * Created by gaurav.
 */
/*4. Write a program to print following pattern?
Input : n = 5
Output:
* * * * * * * * *
  * * * * * * *
    * * * * *
      * * *
        *
*/
package ControlStatementsAssignments3;

import java.util.Scanner;

public class Ques4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("How many rows of star pattern you want to print");
        int n = sc.nextInt();
        int j;
        for(int i = n; i>=1; i--){
            for(j = 1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int k=1; k<=(n+i)-j; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
