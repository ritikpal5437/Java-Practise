public class AgnosticBS {
    public static void main(String[] args) {
        int[] arr={-12,-9,-5,0,1,2,4,6,7,8,9,10,11,33,55,77,88,99,123,134,566,788};
        int target=6;
        int ans = AgnosticBS(arr,target);
        System.out.println(ans);
        

    }

    static int AgnosticBS(int[] arr, int target) {
         int start=0;
         int end = arr.length-1;
          boolean isASC=arr[start]<arr[end];




         while (start<=end) {
int mid=start+(end-start)/2;

if (arr[mid]==target){
    return mid;
}
if (isASC){
if(target<arr[mid]){
    end=mid-1;
}
else {
    start=mid+1;
}
}
else{ 
    if(target>arr[mid]){
    end=mid-1;
}
else {
    start=mid+1;


             
         }

    }
}
return -1;
    }
}