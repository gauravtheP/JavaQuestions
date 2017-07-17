/*
 * Created on 19/5/17.
 */
package MiscellaneousJavaPrograms.QuickSort;

public class QuickSort {
    private int[] array;
    private int length;

    public static void main(String args[]) {
        int[] inputArray = {6,5,4,3,2,1};
        QuickSort qs = new QuickSort();
        qs.sort(inputArray);
        System.out.println("Sorted array elements are:");
        for (int i = 0; i < qs.length; i++) {
            System.out.print(inputArray[i] + " ");
        }
    }

    public void sort(int inputArray[]) {
        this.array = inputArray;
        this.length = inputArray.length;
        doQuickSort(0, length - 1);
    }

    private void doQuickSort(int lowerIndex, int higherIndex) {
        if (lowerIndex < higherIndex) {
            int q;
            q = Partition(lowerIndex, higherIndex);
            System.out.println("Returned Value of q is: "+q);
            System.out.println();
            doQuickSort(lowerIndex,q-1);
            doQuickSort(q + 1, higherIndex);
        }
    }
    private int Partition(int lowerIndex, int higherIndex){
        for (int i = lowerIndex; i <= higherIndex; i++) {
            System.out.print(array[i]+" ");
        }
            System.out.println();
        int i = lowerIndex - 1;
        System.out.println("Pivot is: "+array[higherIndex]);
        for(int j=lowerIndex; j<=higherIndex-1; j++) {
            if (array[j] <= array[higherIndex]) {
                i = i + 1;
                int temp1 = array[j];
                array[j] = array[i];
                array[i] = temp1;
            }
        }
        int temp2 = array[higherIndex];
        array[higherIndex] = array[i + 1];
        array[i + 1] = temp2;
        return i + 1;
    }
}
//here above "pivot" element is the last element of array every time means
//array[higherIndex].