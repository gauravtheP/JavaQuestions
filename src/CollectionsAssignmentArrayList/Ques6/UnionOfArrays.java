package CollectionsAssignmentArrayList.Ques6;
import java.util.Scanner;
import java.util.ArrayList;
/*
 * Created by gaurav on 25/6/17.
 */
/*Q6. (Combine two lists) Write a method that returns the union of two array lists
 of integers using the following header:

 public static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2)

 For example, the union of two array lists {2, 3, 1, 5} and {3, 4, 6} is
 {2, 3, 1, 5, 3, 4, 6}. Write a test program that prompts the user to enter two
 lists, each with five integers, and displays their union. The numbers are
 separated by exactly one space in the output.*/

public class UnionOfArrays {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        System.out.println("How many array elements you want to enter in first array");
        int size1 = sc.nextInt();
        for(int i = 0; i<size1; i++){
            list1.add(sc.nextInt());
        }
        System.out.println("How many array elements you want to enter in second array");
        int size2 = sc.nextInt();
        for(int i = 0; i<size2; i++){
            list1.add(sc.nextInt());
        }
        union(list1, list2);
        System.out.print("Union to arrays: ");
        for(int i = 0; i<size1+size2; i++){
            System.out.print(list1.get(i)+" ");
        }
    }
    public static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2){
        list1.addAll(list2);
        return list1;
    }

}
