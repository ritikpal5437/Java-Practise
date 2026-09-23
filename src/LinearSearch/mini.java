public class mini {
    public static void main(String[] args) {
        int[] arr={23,534,456,123,65,79,43,23,56,78,34,56,67};
        System.out.println(mini(arr));
    }
        static int mini(int[] arr){
            int ans =arr[0];
            for (int i = 1; i < arr.length; i++) {
                if(arr[i]<ans){
                    ans=arr[i];

                }
            }
            return ans;



        }
    }
    