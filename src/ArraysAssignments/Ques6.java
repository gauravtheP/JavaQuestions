package ArraysAssignments;

import java.util.Arrays;


/* Created by gaurav on 18/6/17.
 * 6. Write a program to find duplicate element in an integer array?*/

public class Ques6 {

    public static void main(String a[]){
        int[] numbers = { 1,5,3,3,6,1,2,1,2,1,2};
        Arrays.sort(numbers);

        for(int i = 1; i < numbers.length; i++){
            if(numbers[i] == numbers[i - 1]){
                System.out.println("Duplicate: " + numbers[i]);
            }
        }
    }
}