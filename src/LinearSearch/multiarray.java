
import java.util.Arrays;

public class multiarray {

    public static void main(String[] args) {
        int[][] arr={
            {34,2,4},
            {42,4,5},
            {54,6,78},
            {56,4,66,8}

        };
        int targ=78;
        int[] ans=search(arr,targ);
        System.out.println(Arrays.toString(ans));
                }
        static int[] search(int[][]arr,int targ ){
            for (int row = 0; row < arr.length; row++) {
                for (int col = 0; col < arr.length; col++) {
                    if (arr[row][col]==targ) {
                        return new int[]{row,col};
                        
                    }
                }
                
            }
        
        return new int[]{-1,-1};
            }
        
    }

    
