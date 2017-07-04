package CollectionsAssignmentArrayList.Ques1;
import java.util.Scanner;
import java.util.ArrayList;

/*
 * Created by gaurav on 25/6/17.
 */
/*Q1. (Maximum element in ArrayList) Write the following method that returns the
maximum value in an ArrayList of integers. The method returns null if the
list is null or the list size is 0.
 public static Integer max(ArrayList<Integer> list)
 Write a test program that prompts the user to enter a sequence of numbers
 ending with 0, and invokes this method to return the largest number in the
 input*/

public class MaxArrayList {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("How many elements you want to enter");
        int size = sc.nextInt();
        System.out.println("Enter numbers ending with 0");
        for(int i = 0; i<size; i++){
            Integer numbers = sc.nextInt();
            if(numbers % 10!= 0) {
                System.out.println("Number should end with zero. Enter again!!!");
                i = i-1;
            }
            else{
            list.add(numbers);
            }
        }
        System.out.println("You have entered the following elements ending with zero");
        for(int i = 0; i<size; i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
        System.out.println("Maximum integer in a list is: "+max(list));
    }
    public static Integer max(ArrayList<Integer> list){
        int max = list.get(0);
        for(int i = 0; i<list.size(); i++){
            if(list.get(i)>max){
                max = list.get(i);
            }
        }
        return max;
    }
}