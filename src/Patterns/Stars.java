// package Patterns;

/**
 * Stars
 */
public class Stars {

     public static void main(String[] args) {
        Pattern(4);

     }
      static void Pattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
     }
