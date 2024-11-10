import java.util.Scanner;
/*
n = 5
1
0 1
1 0 1
0 1 0 1
1 0 1 0 1
*/
public class Patterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        
        // Outer loop
        for(int i=1;i<=n;i++){
            // inner loop
            for (int j=1; j<=i; j++) {
                if((i+j)%2 == 0) { // if i+j is even , we will print 1
                System.out.print(1+" ");
                } else { // else will print 0 (odd case)
                    System.out.print(0+" ");
                }
            }
            System.out.println();
        }
    }
}
