package ArraysAssignments;
import java.util.Scanner;
/*
 * Created by gaurav on 18/6/17.
 */
/*1. Write a program to find the largest and smallest element in the given array?*/

import java.util.Scanner;

public class Ques1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter Array Elements");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        double smallest = Double.POSITIVE_INFINITY;
        for (int i = 0; i < size; i++) {
            if (smallest > arr[i]) {
                smallest = arr[i];
            }
        }
        double largest = Double.NEGATIVE_INFINITY;
        for (int i = 0; i < size; i++) {
            if (largest < arr[i]) {
                largest = arr[i];
            }
        }
        System.out.println("Smallest: " + (int)smallest);
        System.out.println("largest: " + (int)largest);
    }
}
