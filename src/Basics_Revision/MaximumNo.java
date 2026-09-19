//package Basics_Revision;
//import java .util.Scanner;
//public class MaximumNo {
//
//    public static void main(String[] args) {
//        Scanner sc =new Scanner(System.in);
//        System.out.println("Enter the no.");
//        int n = sc.nextInt();
//        int max=Integer.MIN_VALUE;
//        for (int i = 1; i <=n ; i++) {
//            int num = sc.nextInt();
//
//        if (num > max) {
//            max = num;
//        }
//
//        }
//            System.out.println("Maximum = " + max);
//        sc.close();
//    }
//}

package Basics_Revision;

import java.util.Scanner;

public class MaximumNo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no.");
        int n = sc.nextInt();

        int min = Integer.MAX_VALUE;

        for (int i = 1; i <= n; i++) {

            int num = sc.nextInt();

            if (num < min) {
                min = num;
            }
        }

        System.out.println("Minimum = " + min);

        sc.close();
    }
}
