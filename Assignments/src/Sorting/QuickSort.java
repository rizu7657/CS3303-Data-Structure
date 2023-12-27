package Sorting;

import java.util.Arrays;

public class QuickSort {
    static int exchanges;

    public static void main(String[] args) {
        exchanges = 0;
        int[] e = {12,9,4,99,120,1,3,10,23,45,75,69,31,88,101,14,29,91,2,0,77};

        System.out.println(Arrays.toString(e));
        quickSort(e, 0, e.length - 1);
        System.out.println(Arrays.toString(e));
        System.out.println("Exchanges: " + exchanges);
    }

    public static void quickSort(int[] arr, int begin, int end) {
        if (begin < end) {
            int partitionIndex = partition(arr, begin, end);

            quickSort(arr, begin, partitionIndex-1);
            quickSort(arr, partitionIndex+1, end);
        }
    }

    private static int partition(int[] arr, int begin, int end) {
        int pivot = arr[end];
        int i = (begin-1);

        for (int j = begin; j < end; j++) {
            if (arr[j] <= pivot) {
                i++;

                if (i != j) {
                    int swapTemp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = swapTemp;
                    exchanges = exchanges + 1;
                }
            }
        }

        int swapTemp = arr[i+1];
        arr[i+1] = arr[end];
        arr[end] = swapTemp;
        exchanges = exchanges + 1;

        return i+1;
    }
}