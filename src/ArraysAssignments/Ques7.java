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
        int[] arr2 = new int[size];
        System.out.println("Enter Array Elements");
        for(int i = 0; i<size; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0, j = size-1; j>=0; j--){
            arr2[i] = arr[j];
            if(i<size-1) {
                i++;
            }
        }

        for(int i = 0; i<size; i++){
            arr[i] = arr2[i];
        }

        System.out.print("Reversed array: ");
        for(int i = 0; i<size-1; i++){
            System.out.print(arr[i]+", ");
        }
            System.out.print(arr[size-1]);
    }
}