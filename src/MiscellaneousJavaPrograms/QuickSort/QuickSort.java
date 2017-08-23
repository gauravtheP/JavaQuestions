/*
 * Created on 19/5/17.
 */
package MiscellaneousJavaPrograms.QuickSort;

import java.util.Scanner;

public class QuickSort {
    private int[] array;
    private int length;

    private void sort(int inputArray[]) {
        this.array = inputArray;
        this.length = inputArray.length;
        doQuickSort(0, length - 1);
    }

    private void doQuickSort(int lowerIndex, int higherIndex) {
        if (lowerIndex < higherIndex) {
            int q;
            q = Partition(lowerIndex, higherIndex);
            doQuickSort(lowerIndex,q-1);
            doQuickSort(q + 1, higherIndex);
        }
    }

    private int Partition(int lowerIndex, int higherIndex){

        int i = lowerIndex - 1;
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

    public static void main(String args[]) {
        QuickSort qs = new QuickSort();
        Scanner sc = new Scanner(System.in);
        int i, size;
        System.out.print("Enter the size of array\n");
        size = sc.nextInt();
        int array[] = new int[size];
        System.out.print("Enter array Elements\n");
        for(i=0; i<size; i++){
            array[i]=sc.nextInt();
        }
        qs.sort(array);

        System.out.print("Sorted array elements are: ");
        for (i = 0; i < qs.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
//here above "pivot" element is the last element of array every time means
//array[higherIndex].