package ArraysAssignments;

/*
 * Created by gaurav on 18/6/17.
 */
/*5. Write a program to find the missing number in integer array of 1 to 100? */

import java.util.Scanner;

public class Ques5{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size");
        int size = sc.nextInt();
        int[] A = new int[size];
        System.out.println("Enter Array Elements");
        for(int i = 0; i<size; i++){
            A[i] = sc.nextInt();
        }
        System.out.print("Entered Array(already sorted): ");
        for (int j = 0; j < A.length; j++)
            System.out.print(A[j] +" ");

        System.out.println("\nNumbers missing between 1 to 100 in array :  ");
        int j = 0, flag = 0;
        for(int i=1;i<=100;i++) {
            if (j < A.length && i == A[j])
                j++;
            else
            System.out.print(i+" ");
            flag++;
            if(flag%10==0){
                System.out.println();
            }
        }
    }
}