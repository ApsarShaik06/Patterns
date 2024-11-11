import java.util.Scanner;
/*
n = 5
        1
      2   2 
    3   3   3
  4   4   4   4
5   5   5   5   5
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

           // for number print and inner space 
           for(int j =1; j<=(2*i)-1; j++) {
              if(j%2 == 0) { // for space
                System.out.print("  ");
              } else {
                System.out.print(i+" ");
              }
           }
        System.out.println();
        }


    }
}
