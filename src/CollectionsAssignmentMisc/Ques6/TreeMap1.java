package CollectionsAssignmentMisc.Ques6;
import java.util.Scanner;
import java.util.TreeMap;
/*
 * Created by gaurav on 25/6/17.
 */
/*You are given with unsorted array and an element, find the next highest element
than a given element x in the input array using TreeMap1?
	Example :
			Input : 10, 30, 50, 67, 34, 68
				    x = 67
		    output : 68*/

public class TreeMap1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        System.out.println("How many array elements you want to enter");
        int size = sc.nextInt();
        Integer [] array = new Integer[size];
        System.out.println("Enter array Elements");
        for(int i = 0; i<size;i++){
            array[i] = sc.nextInt();
            treeMap.put(array[i], i);
        }
        System.out.println("Enter element to find the next higher");
        int smaller = sc.nextInt();
        System.out.println("Next higher element after "+smaller+" is "+treeMap.higherKey(smaller));
    }
}
