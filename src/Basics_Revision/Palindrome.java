package Basics_Revision;
import java.util.Scanner;
public class Palindrome{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int original=n;
        int digit;
        int reverse=0;
        while(n!=0){
            digit=n%10;

            reverse = reverse* 10+digit;
            n=n/10;
        }
        if(reverse==original){
        System.out.println("Palindorme");
        }
        else{
            System.out.println("Not Palindrome");
        }
        sc.close();
    }
}
