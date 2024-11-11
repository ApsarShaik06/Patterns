import java.util.Scanner;
/*
n = 4
      1 
    2 1 2
  3 2 1 2 3
4 3 2 1 2 3 4
*/
public class Patterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        
        // Outer loop
        for(int i=1;i<=n;i++){
           // for space
           for(int j =1; j<= n-i; j++) {
            System.out.print("  ");
           }

           // for left part number print 
           for(int j =i; j>=1; j--) {
                System.out.print(j+" ");
           }

           // for right part number print
           for(int j = 2; j<=i; j++) {
            System.out.print(j+" ");
           }
        System.out.println();
        }


    }
}
