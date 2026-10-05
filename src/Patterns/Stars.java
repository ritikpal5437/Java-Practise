
public class Stars {

     public static void main(String[] args) {
        pattern28(5);

     }

     // full code
      static void pattern28(int n) {
      for (int row = 1; row <= n; row++) {
            // int c =row>n?2*n-row:row;
            // int spaces=n-c;
            for(int s =0;s<n-row;s++){
                System.out.print(" ");
            }
            for (int col = row; col >=1; col++) {
                System.out.print(col);
            }
            for (int col = 2; col <= row; col++) {
                System.out.print(col);

        }System.out.println();
            }
     }
   
            
     static void pattern10(int n){
        for (int row = 1; row <= 2*n; row++) {
            int c =row>n?2*n-row:row;
            for (int col = 1; col <= c; col++) {
                System.out.print("*");

        }System.out.println("");
            }
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

            for (int row=1; row<=n; row++) {
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