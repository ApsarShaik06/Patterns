import java.util.Scanner;
/*
n=4
A
BC
DEF
GHIJ
*/
public class Patterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        char c = 'A';
        // Outer loop
        for(int i=1;i<=n;i++){
            // inner loop
            for (int j=1; j<=i; j++) {
                System.out.print(c);
                c++;
            }
            System.out.println();
        }
    }
}
