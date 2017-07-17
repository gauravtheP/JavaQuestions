/*
 * Created on 18/5/17.
 */

package MiscellaneousJavaPrograms.MergeSort;

public class MergeSort {
    private int[] array;
    private int[] tempMergeArray;
    private int length;

    public static void main(String args[]) {
        int[] inputArray = {5,4,3,2,1};
        MergeSort ms = new MergeSort();
        ms.sort(inputArray);
        System.out.println("Sorted array elements are:");
        for (int i = 0; i < ms.length; i++) {
            System.out.print(inputArray[i] + " ");
        }
    }

    public void sort(int inputArray[]) {
        this.array = inputArray;
        this.length = inputArray.length;
        this.tempMergeArray = new int[length+2];
        doMergeSort(0, length - 1);
    }

    private void doMergeSort(int lowerIndex, int higherIndex) {
        if (lowerIndex < higherIndex) {
            int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
            // Below step sorts the left side of the array
            doMergeSort(lowerIndex, middle);
            // Below step sorts the right side of the array
            doMergeSort(middle + 1, higherIndex);
            // Below step are merging the array
            mergeParts(lowerIndex, middle, higherIndex);
        }
    }

    private void mergeParts(int lowerIndex, int middle, int higherIndex) {
        for (int i = lowerIndex; i <= higherIndex; i++) {
            tempMergeArray[i] = array[i];
            System.out.print(tempMergeArray[i]+" ");
        }
        System.out.println();
        int i = lowerIndex;
        int j = middle + 1;
        int k = lowerIndex;
        while (i <= middle && j <= higherIndex)   //This is while loop.
        {
            if (tempMergeArray[i] <= tempMergeArray[j]) {
                array[k] = tempMergeArray[i];
                i++;
            } else {
                array[k] = tempMergeArray[j];
                j++;
            }
            k++;
        }
        for(i=lowerIndex;i<=middle; i++) {
            array[k] = tempMergeArray[i];
            k++;
        }
    }
}