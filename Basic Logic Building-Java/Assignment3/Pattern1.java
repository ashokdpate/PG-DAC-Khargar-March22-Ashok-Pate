import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        // System.out.print("Enter the number:-");
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
int n=5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {

                System.out.print(" "+j);
            }
            System.out.println();
        }
    }
}