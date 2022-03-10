// 15. Write a Java program to swap two variables.
import java.util.*;
public class Question15 {
    public static void main(String[] args) {
        System.out.println("Enter number1:");
       Scanner var=new Scanner(System.in);
        int num1=var.nextInt();
        System.out.println("Enter number2:");
        int num2=var.nextInt();
        
        System.out.println("Before Swapping ="+num1);
        System.out.println("Before Swapping ="+num2);
        int temp=num2;
        num2=num1;
        num1=temp;
        System.out.println("After swapping num1 ="+num1);
        System.out.println("After swapping num2 ="+num2);
    }
}
