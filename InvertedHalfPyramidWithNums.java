import java.util.Scanner;

public class Patterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        

        // Outer loop
        for(int i=n;i>=1;i--){
            // inner loop
            for (int j=1; j<=i; j++) {
                // for printing stars
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
