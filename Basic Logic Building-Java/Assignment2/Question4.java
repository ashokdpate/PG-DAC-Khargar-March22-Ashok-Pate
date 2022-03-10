//4. Write a Java program to print the result of the following operations. 
//Test Data: 
//a. -5 + 8 * 6
//b. (55+9) % 9
//c. 20 + -3*5 / 8
//d. 5 + 15 / 3 * 2 - 8 % 3
//Expected Output : 43, 1, 19, 13

public class Question4 {
    public static void main(String[] args) {
        int ans1,ans2,ans3,ans4;
        ans1=-5+8*6;
        ans2= (55+9)% 9;
        ans3= 20 + -3*5 / 8;
        ans4=5 + 15 / 3 * 2 - 8 % 3;

        System.out.println(ans1);
        System.out.println(ans2);
        System.out.println(ans3);
        System.out.println(ans4);
    }  
}
