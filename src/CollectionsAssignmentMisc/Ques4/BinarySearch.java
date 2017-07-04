package CollectionsAssignmentMisc.Ques4;
/*
 * Created by gaurav on 25/6/17.
 */
/*Count number of 1's in binary sorted array using binarySearch() function?
		Example :
			Input : 0, 0, 0 , 1, 1, 1, 1, 1
		    output : 5*/
public class BinarySearch {

    public static void main(String[] args) {
        int[] input = {0, 0, 0 , 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        System.out.println(countNumberOfOnes(input));
    }
    private static int countNumberOfOnes(int[] input) {
        int mid = 0, low = 0, high = input.length;
        while(low != high) {
            mid = (low + high)/2;
            if (input[mid] == 0) {
                low = mid + 1;
            } else {
                high = mid -1;
            }
        }
        return input[low] ==0 ? input.length - (low+1) : input.length - low;
    }
}
