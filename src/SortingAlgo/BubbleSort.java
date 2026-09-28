package SortingAlgo;

import java.util.Arrays;?

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 7, 3, 5, -7, -3, -1, -8, 9, 0};

        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int [] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length-1; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
    }
    }