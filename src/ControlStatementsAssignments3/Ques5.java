/*
 * Created by gaurav.
 */
/*5. Write a program to print following pattern?
Enter number of rows: 5

          *
        * * *
      * * * * *
    * * * * * * *
  * * * * * * * * *
    * * * * * * *
      * * * * *
        * * *
          *
*/
package ControlStatementsAssignments3;

import java.util.Scanner;

public class Ques5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("How many rows of Diamond pattern you want to print");
        int n = sc.nextInt();
        for(int i = 1; i<=n*2; i+=2){
            for(int j = 1; j<=((2*n)-i)/2; j++){
                System.out.print(" ");
            }
            for(int k = 1; k<=i ; k++){
                System.out.print("*");
            }
            System.out.println();
        }
        int m;
        for(int l = n-1; l>=1; l--){
            for(m = 1; m<=n-l; m++){
                System.out.print(" ");
            }
            for(int o=1; o<=(n+l)-m; o++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
