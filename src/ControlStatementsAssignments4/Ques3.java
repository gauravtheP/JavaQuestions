package ControlStatementsAssignments4;
import java.util.Scanner;
/*
 * Created by gaurav.
 */
/*Q3:(Sort three integers) Write a program that prompts the user to enter three integers
and display the integers in non-decreasing order.*/
public class Ques3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        System.out.println("Enter three integers");
        for (int i = 0; i < 3; i++) {
            arr[i] = sc.nextInt();
        }
        for(int j = 0; j<3; j++){
            for(int k=j+1; k<3; k++){
                if(arr[j]>arr[k]){
                    int temp = arr[j];
                    arr[j] = arr[k];
                    arr[k] = temp;
                }
            }
        }
        System.out.println("Sorted array list is: ");
        for (int i = 0; i < 3; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}