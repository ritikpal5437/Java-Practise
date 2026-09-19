package Array;
import java.util.Scanner;
public class sum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size= sc.nextInt();
        int[] arr=new int[size];
        int sum=0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] > max) {
                max=arr[i];

            }
            if (arr[i]<min) {
                min=arr[i];

            }

            sum=arr[i]+sum;
        }
        System.out.println("Elements are:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
            System.out.println("Sum:"+sum);
            System.out.println("Max:"+max);
            System.out.println("Min:"+min);
    }
}
