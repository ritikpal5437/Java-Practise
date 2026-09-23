class more {
    public static void main(String[] args) {

        int[] arr = {123, 123, 123, 3557, 78, 34, 78, 43, 78, 5};
        int tar = 123;
        int count = 0;
 for (int i = 0; i < arr.length; i++) {

            if (arr[i] == tar) {
                count++;
                System.out.println(
                    "Element: " + arr[i] +
                    " found at index: " + i
                );
            }
        }

        if (count > 0) {
            System.out.println("Element found " + count + " times");
        } else {
            System.out.println("Element not found");
        }
    }
}