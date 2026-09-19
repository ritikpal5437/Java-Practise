package Array;
import java.util.Scanner;
public class FindElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Size of an array");
        int size= sc.nextInt();
        System.out.println("elements of an array");
        int[] arr= new int[size];
        for (int i = 0; i < arr.length; i++) {
         arr[i]= sc.nextInt();
        }

            System.out.println("elemts to found");
        int target = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == target) {
                found = true;
                System.out.println("Found at index: " + i);
                break;
            }
        }

        if (!found) {
            System.out.println("Not exist");
        }

        sc.close();  }
    }

