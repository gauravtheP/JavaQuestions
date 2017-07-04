package CollectionsAssignmentMisc.Ques3;
import java.util.PriorityQueue;

/*
 * Created by gaurav on 25/6/17.
 */
/*Find the Kth smallest element from the unsorted array using PriorityQueue class?
	Example :
			Input : 10, 30, 50, 67, 34, 68
				   k = 3
		    output : 34*/

public class PriorityQueue2 {

    public static void main(String[] args) {
        int[] Array = {10, 30, 50, 67, 34, 68};
        int k = 3;
        System.out.println("3rd Smallest element is "+KthLargestElement(Array, k));
    }

    private static int KthLargestElement(int[] Array, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        if (Array.length < k) {
            return -1;
        }
        int kthSmallestElement = 0;
        for (int ele : Array) {
            pq.add(ele);
        }
        for(int i = 0; i<k; i++) {
            kthSmallestElement = pq.poll();
        }
        return kthSmallestElement;
    }
}
