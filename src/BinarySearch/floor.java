package BinarySearch;

import java.lang.reflect.Array;

public class floor {
    public static void main(String[] args) {
        int[] arr={-12,-9,-5,0,1,2,4,6,7,8,9,10,11,33,55,77,88,99,123,134,566,788};
        int target=5;
        int ans = floor(arr,target);
        System.out.println(ans);
//        System.out.println(Array.toString);

    }

    static int floor(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }

        return end;


    }


}



