package Basics_Revision;
import java.util.Scanner;
public class Smallest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("NUMBERS");
        int n = sc.nextInt();
        int smallest=Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();

            if (num < smallest) {
                smallest = num;

        }}
        System.out.println("smallest: "+smallest);
        sc.close();
    }

}

//MAX → initially sabse chhoti possible value
//MIN → initially sabse badi possible value