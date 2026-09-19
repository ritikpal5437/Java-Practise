package Basics_Revision;
import java.util.Scanner;
public class SecondLargest {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("NUMBERS");
        int n = sc.nextInt();
        int Large=Integer.MIN_VALUE;
        int seclarge=Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();

            if (num > Large) {
                seclarge=Large;
                Large= num;

            }
            else if (num>seclarge && num!=Large){
                seclarge=num;
            }
        }
        System.out.println("largest: "+Large);
        System.out.println("Seclargest: "+seclarge);
        sc.close();
    }

}