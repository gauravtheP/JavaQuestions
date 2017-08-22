/*
 * Created on 18/5/17.
 */

package MiscellaneousJavaPrograms.MergeSort;

import java.util.Scanner;

public class MergeSort {

    void Merging(int array[], int first, int middle, int last){
        int n1 = middle - first + 1;
        int n2 = last - middle;
        int left[] = new int[n1+1];
        int right[] = new int[n2+1];
        int i, j, k;
        for(i = 0; i<n1; i++){
            left[i] = array[first + i];
        }
        for(j = 0; j<n2; j++){
            right[j] = array[middle + j + 1];
        }
        left[n1] = 2147483646;
        right[n2] = 2147483646;
        i = 0;
        j = 0;
        for(k = first; k<last+1; k++){
            if(left[i] <= right[j]){
                array[k] = left[i];
                i = i+1;
            }
            else{
                array[k] = right[j];
                j = j+1;
            }
        }
    }

    void MergeSorting(int array[], int first, int last){
        int middle;
        if(first < last){
            middle = (first + last)/2;
            MergeSorting(array, first, middle);
            MergeSorting(array, middle+1, last);
            Merging(array, first, middle, last);
        }
    }

    public static void main(String[] args){
        MergeSort sort = new MergeSort();
        Scanner sc = new Scanner(System.in);
        int i, size;

        System.out.print("Enter the size of array\n");
        size = sc.nextInt();
        int array[] = new int[size];
        System.out.print("Enter array Elements\n");
        for(i=0; i<size; i++){
            array[i]=sc.nextInt();
        }

        int first = 0, last = size-1;
        System.out.print("Sorted Array: ");
        sort.MergeSorting(array, first, last);

        for(i = 0; i<size; i++){
            System.out.print(array[i] + " ");
        }
    }
}