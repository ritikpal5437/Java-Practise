

/**
 * intro for binary search takking an ex for better understanding
 */
public class intro {
    
    public static void main(String[] args) {

        int[] arr={-12,-9,-5,0,1,2,4,6,7,8,9,10,11,33,55,77,88,99,123,134,566,788};
        int target=6;
        int ans = binarysearch(arr,target);
        System.out.println(ans);
        

    }

    static int binarysearch(int[] arr, int target) {
         int start=0;
         int end = arr.length-1;

         while (start<=end) {
//find midd elem
//int mid=(start+end)/2;  but we r not using it because its nt for biiger values of array likes array of million elem
int mid=start+(end-start)/2;
if(target<arr[mid]){
    end=mid-1;
}
else if(target>arr[mid]){
    start=mid+1;
}
else{
    return mid;
}
         }

         return -1;


             
         }

        


    }


   /* if (target < arr[mid]) {
    end = mid - 1;
}
else if (target > arr[mid]) {
    start = mid + 1;
}
else {
    return mid;
}*/

