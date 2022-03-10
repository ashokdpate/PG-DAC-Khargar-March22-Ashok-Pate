/*11. Write a Java program to print the area and perimeter of a circle. 
Test Data:
Radius = 7.5
Expected Output
Perimeter is = 47.12388980384689  perimeter = 2 · π · r
Area is = 176.71458676442586  area=pi x r x r */

public class Question11 {
    public static void main(String[] args) {
       
        double r1 =7.5;
        final double pie=3.14159;
        double peri,area;
        peri=2 * pie * r1;
        System.out.println(peri);
       
        area=pie*r1*r1;
        System.out.println(area);
    }
}
