

public class max{

    public static void main(String[] args) {
        int[][] arr={
            {34,2,4},
            {42,4,5},
            {54,6,78},
            {56,4,66,8}

        };
        // int targ=78;
        // int[] ans=search(arr,targ);
        // System.out.println(Arrays.toString(ans));
        System.out.println(max(arr));
                }
        static int max(int[][]arr){
            int max=Integer.MIN_VALUE;
            for (int row = 0; row < arr.length; row++) {
                for (int col = 0; col < arr[row].length; col++) {
                    if (arr[row][col]>max) {
                         max=arr[row][col];
                        
                    }
                }
                
            }
        
        return max;
            }
        
    }

    
 