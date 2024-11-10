import java.util.Scanner;

public class Patterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        

        // Outer loop
        for(int i=1;i<=n;i++){
            // inner loop
            for (int j=1; j<=n; j++) {
                // for printing stars
                if(i+j > n){
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
