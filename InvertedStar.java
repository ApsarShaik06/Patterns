import java.util.Scanner;
/*
8
* * * * * * * *
* * * * * * *
* * * * * *
* * * * *
* * * *
* * *
* *
*
*/
public class Patterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        // Outer loop
        for(int i=1;i<=n;i++){
            // inner loop
            for (int j=1; j<=n-i+1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
