package Basics_Revision;
import java.util.Scanner;
public class Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int count=0;
        while(n!=0){
//            int digit=n%10;// for terminating the last digit of users input
            n=n/10;
            // the way of finding the last digit or sum of digit or the no of diigit by this way


        count++;
        }
        System.out.println(count);
        sc.close();
    }
}
