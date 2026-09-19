
import java.util.Scanner;
public class Countere {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int size=sc.nextInt();
        System.out.println("Elements are:");
        int[] arr=new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i]= sc.nextInt();

        }
        int even=0;
        int odd=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] %2==0 ) {
                even++;
            }
            else {
                odd++;
            }
        }
        System.out.println("Even numbers: " + even);
        System.out.println("Odd numbers: " + odd);

    }
}
