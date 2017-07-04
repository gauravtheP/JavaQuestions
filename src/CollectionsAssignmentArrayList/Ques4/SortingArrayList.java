package CollectionsAssignmentArrayList.Ques4;
import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;

/*
 * Created by gaurav on 25/6/17.
 */
/*Q4. (Sort ArrayList) Write the following method that sorts an ArrayList of numbers:                                                                              *
        public static void sort(ArrayList<Integer> list)
 Write a test program that prompts the user to enter 5 numbers, stores them in
 an array list, and displays them in increasing order.*/

public class SortingArrayList {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Enter 5 Integers");
        for (int i = 0; i <5; i++) {
            list.add(sc.nextInt());
        }
        Collections.sort(list);
        System.out.println("Sorted List: "+list);
    }
}
