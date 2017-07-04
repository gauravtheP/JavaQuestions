package CollectionsAssignmentMisc.Ques2;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

/*
 * Created by gaurav on 25/6/17.
 */
/*Find the Kth largest element from the given array using PriorityQueue class?
	Example :
			Input : 10, 30, 50, 67, 34, 68
				   k = 3
		    output : 50*/
public class PriorityQueue1 {

    public static class ReverseOrder implements Comparator<Integer>{
        public int compare(Integer first, Integer second) {
            if (first < second) {
                return 1;
            }
            if (first > second) {
                return -1;
            }
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size");
        int size = sc.nextInt();
        int[] Array = new int[size];
        System.out.println("Enter Array Elements");
        for(int i = 0; i<size; i++){
            Array[i] = sc.nextInt();
        }
        int k = 3;
        System.out.println("3rd largest element is "+getKthLargestElement(Array, k));
    }

    private static int getKthLargestElement(int[] Array, int k) {
        Comparator<Integer> comparator = new ReverseOrder();
        PriorityQueue<Integer> pq = new PriorityQueue<>(6, comparator);
        if (Array.length < k) {
            return -1;
        }
        int kthLargestElement = 0;
        for (int elements : Array) {
            pq.add(elements);
        }
        for(int i = 0; i<k; i++) {
            kthLargestElement = pq.poll();
        }
        return kthLargestElement;
    }
}