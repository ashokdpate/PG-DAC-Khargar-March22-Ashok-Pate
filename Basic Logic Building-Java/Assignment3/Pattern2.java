import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        System.out.print("Enter the number:-");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            int ch=65;
            for (int j = 1; j <= i; j++) {

                System.out.print((char)ch);
                System.out.print(" ");
                ch++;
            }
            System.out.println();
        }
    }
}
