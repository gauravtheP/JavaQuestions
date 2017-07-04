package ArraysAssignments;

/*
 * Created by gaurav on 18/6/17.
 */
/*2. Given an array A[], write a program to check whether the element "x"
present in the array or not?*/

import java.util.Scanner;

public class Ques2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size");
        int size = sc.nextInt();
        int[] A = new int[size];
        System.out.println("Enter Array Elements");
        for(int i = 0; i<size; i++){
            A[i] = sc.nextInt();
        }
        System.out.println("Enter the element you want to check");
        int element = sc.nextInt();
        for(int i = 0; i<size; i++){
            if(A[i]==element){
                System.out.print("Element "+element+" found at position ");
                System.out.print(i+1);
                break;
            }
        }
    }
}
