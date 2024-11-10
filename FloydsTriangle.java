import java.util.Scanner;

public class Patterns {
    /*
     * n = 5
        1
        2 3 
        4 5 6
        7 8 9 10
        11 12 13 14 15
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        
        int num =1;
        // Outer loop
        for(int i=1;i<=n;i++){
            // inner loop
            for (int j=1; j<=i; j++) {
                // for printing stars
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }
}
