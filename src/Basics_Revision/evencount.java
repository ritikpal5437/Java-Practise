package Basics_Revision;
import java.util.Scanner;
public class evencount{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int odd=0;
        int even=0;
        for (int i = 1; i <=n ; i++) {
            int num=sc.nextInt();
            if (num % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        System.out.println("Even = " + even);
        System.out.println("Odd = " + odd);


        sc.close();
    }


    }
