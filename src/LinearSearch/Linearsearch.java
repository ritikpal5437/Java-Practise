package LinearSearch;
// we r starting our searching from here in which we use functions and array for loop
public class Linearsearch {
    public static void main(String[] args) {

        int[] arr={345,324,56,78,23,45,78,21,67,23,5};
        int target=5;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println("Element"+arr[i]+ " is found at index: " + i);

                return;
            }
        }
        System.out.println("Element not found");

 }
}
