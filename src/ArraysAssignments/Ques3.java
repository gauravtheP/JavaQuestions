package ArraysAssignments;

/*
 * Created by gaurav on 18/6/17.
 */
/*3. Given an array A[], write a program to sort the array?*/

import java.util.Scanner;

public class Ques3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size");
        int size = sc.nextInt();
        int[] A = new int[size];
        System.out.println("Enter Array Elements");
        for(int i = 0; i<size; i++){
            A[i] = sc.nextInt();
        }
        for(int i = 0; i<size; i++){
            for(int j = i+1; j<size; j++){
                if(A[i]>A[j]){
                    int temp = A[i];
                    A[i] = A[j];
                    A[j] = temp;
                }
            }
        }
        System.out.print("Sorted array list: ");
        for(int i = 0; i<size-1; i++){
            System.out.print(A[i]);
            System.out.print(", ");
        }
        System.out.print(A[size-1]);
    }
}
