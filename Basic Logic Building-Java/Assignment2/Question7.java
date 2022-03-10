/* 7. Write a Java program that takes a number as input and prints its multiplication 
table upto 10. 
Test Data:
Input a number: 8
Expected Output :
8 x 1 = 8
8 x 2 = 16
8 x 3 = 24
...
8 x 10 = 80*/

public class Question7 {
    public static void main(String[] args) {
        int num1=8;
        int ans;
        System.out.println("The multiplication table of"+num1+ "=");
        for(int i=1; i<=10; i++)
        {
            ans=num1*i;
            System.out.println(ans);
        }
    }
}
