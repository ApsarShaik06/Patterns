import java.util.Scanner;
/*
4
      *
    * * *
  * * * * *
* * * * * * *
* * * * * * *
  * * * * *
    * * *
      * 
*/
public class Patterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        
        // Outer loop - Upper Part
        for(int i=1;i<=n;i++){
           // for space
           for(int j =1; j<= n-i; j++) {
            System.out.print("  ");
           }

           // for star 
           for(int j =1; j<=(2*i)-1; j++) {
            System.out.print("* ");
           }
        System.out.println();
        }

           // Outer loop - Lower Part
           for(int i=n; i>=1; i--){
            // for space
            for(int j =1; j<= n-i; j++) {
             System.out.print("  ");
            }
 
            // for star 
            for(int j =1; j<=(2*i)-1; j++) {
             System.out.print("* ");
            }
         System.out.println();
         }

    }
}
