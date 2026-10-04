
public class Stars {

     public static void main(String[] args) {
        pattern9(5);

     }
     //inveted prym
         static void pattern9(int n) {

            for (int row=  1; row<=n; row++) {
                for (int space = 1; space <=row-1; space++) {
                    System.out.print(" ");
                    
                }
                for (int col = 1; col <=2*(n-row)+1; col++) {
                    System.out.print("*");
            }System.out.println();
                }
            
        }
     //spaces printing\
       static void pattern7(int n) {

            for (int row=  1; row<=n; row++) {
                for (int space = 1; space <= n-row; space++) {
                    System.out.print(" ");
                    
                }
                for (int col = 1; col <=row; col++) {
                    System.out.print("* ");
            }System.out.println();
                }
            
        }
         static void pattern8(int n) {

            for (int row=  1; row<=n; row++) {
                for (int space = 1; space <= n-row; space++) {
                    System.out.print(" ");
                    
                }
                for (int col = 1; col <=2*row-1; col++) {
                    System.out.print("*");
            }System.out.println();
                }
            
        }
        static void pattern6(int n) {
            for (int row=  1; row<= 5; row++) {
                for (int col = 1; col <=row; col++) {
                    System.out.print(row);
            }System.out.println();
                }
            
        }

     
      static void pattern5(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
                        System.out.println();
        }
    }
  static void pattern3(int n) {
        for (int row = 1; row <= n; row++) {
            // for every row, run the col
            for (int col = 1; col <= n-row+1; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern1(int n) {
        for (int row = 1; row <= n; row++) {
            // for every row, run the col
            for (int col = 1; col <= n; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern2(int n) {
        for (int row = 1; row <= n; row++) {
            // for every row, run the col
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}