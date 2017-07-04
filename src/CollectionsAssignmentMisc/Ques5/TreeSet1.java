package CollectionsAssignmentMisc.Ques5;
import java.util.TreeSet;
import java.util.ArrayList;
import java.util.Scanner;
/*
 * Created by gaurav on 25/6/17.
 */
/*Find the sum of k smallest elements in given unsorted array using TreeSet1?
		Example :
			Input : 10, 30, 50, 67, 34, 68
				   k = 3
		    output : 74*/

public class TreeSet1 {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        TreeSet<Integer> treeSet = new TreeSet<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 6 integers");
        for(int i = 0; i<6; i++){
            list.add(sc.nextInt());
        }
        System.out.println("How many smallest element sum you want to find");
        int k = sc.nextInt();
        for(int i = 0; i<6; i++){
            treeSet.add(list.get(i));
        }
        Integer smallest = treeSet.first();  //first() will return the smallest element in set
        Integer nextHigher = treeSet.higher(smallest);
        Integer sum = smallest + nextHigher;
        for(int i = 0; i<k-2; i++){
           nextHigher = treeSet.higher(nextHigher);
           sum +=nextHigher;
        }
        System.out.println("Sum of "+k+" smallest element is "+sum);
    }
}
