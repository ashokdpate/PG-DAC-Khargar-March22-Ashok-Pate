import java.util.Scanner;

public class Pattern6 {
    public static void main(String[] args) {
        // System.out.print("Enter the number of star:-");
        // Scanner sc=new Scanner(System.in);
        // int n=sc.nextInt();
        int n=5;
        for(int i=1; i<=n;i++)
        {

            for(int j=i; j<=n; j++)
            {
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
