
import java.util.Scanner;
public class postive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     System.out.println("Enter the size of an array:");
    int size=sc.nextInt();
        System.out.println("Elements are:");
    int[] arr=new int[size];
        int postive=0;
        int neg=0;
        int zero=0;
        for (int i = 0; i < arr.length; i++) {
        arr[i] = sc.nextInt();


                if (arr[i] > 0) {
                    postive++;

                } else if (arr[i]<0) {
                    neg++;

                }
                else {
                    zero++;

            }
    }
        System.out.println("positive:"+postive);
        System.out.println("neg:"+neg);
        System.out.println("zero:"+zero);

}
}
