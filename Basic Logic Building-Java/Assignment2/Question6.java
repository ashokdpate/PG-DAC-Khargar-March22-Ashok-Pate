/* 6. Write a Java program to print the sum (addition), multiply, subtract, divide and 
remainder of two numbers. 
Test Data:
Input first number: 125
Input second number: 24
Expected Output :
125 + 24 = 149
125 - 24 = 101
125 x 24 = 3000
125 / 24 = 5
125 mod 24 = 5 */

public class Question6 {
    public static void main(String[] args) {
        int num1=125;
        int num2=24;
        int ans;
        ans=num1+num2;
        System.out.println("The addition of two number is="+ans);
        ans=num1-num2;
        System.out.println("The subtraction of two number is="+ans);
        ans=num1*num2;
        System.out.println("The multiplication of two number is="+ans);
        ans=num1/num2;

        System.out.println("The division of two number is="+ans);   
    }
}
