package Basics_Revision;
import java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int digit;
        int reverse=0;
        while(n!=0){
            digit=n%10;

             reverse = reverse* 10+digit;
            n=n/10;
//            digit = n % 10;          // last digit nikalo
//            reverse = reverse * 10 + digit; // reverse mein add karo
//            n = n / 10;              // last digit hatao

        }
        System.out.println(reverse);
        sc.close();
    }
}
