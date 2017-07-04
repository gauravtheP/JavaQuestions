package ArraysAssignments;

/*
 * Created by gaurav on 18/6/17.
 */
/*7. Write a program to reverse the given array?*/

import java.util.Scanner;

public class Ques7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter Array Elements");
        for(int i = 0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Reverse array: ");
        for(int j = size-1; j>=1; j--){
            System.out.print(arr[j]+ ", ");
        }
        System.out.print(arr[0]);
    }
}
