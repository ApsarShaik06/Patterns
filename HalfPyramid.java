import java.util.Scanner;
/*
n=5
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
*/
public class Patterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        // Outer loop
        for(int i=1;i<=n;i++){
            // inner loop
            for (int j=1; j<=i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
