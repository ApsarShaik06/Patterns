import java.util.Scanner;
/*
n = 4
*             *
* *         * *
* * *     * * *
* * * * * * * *
* * * * * * * *
* * *     * * *
* *         * *
*             * 
*/
public class Patterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        
        // Outer loop - upper part
        for(int i=1;i<=n;i++){
            // inner loop
            // for first left half star print
            for (int j=1; j<=i; j++) {
                System.out.print("* ");
            }

            // for space printing
            for(int j=1; j<=2*(n-i); j++){
                System.out.print("  ");
            }

            // for first right half star print
            for (int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }


          // Outer loop - lower part
          for(int i=n;i>=1;i--){
            // inner loop
            // for first left half star print
            for (int j=1; j<=i; j++) {
                System.out.print("* ");
            }

            // for space printing
            for(int j=1; j<=2*(n-i); j++){
                System.out.print("  ");
            }

            // for first right half star print
            for (int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
