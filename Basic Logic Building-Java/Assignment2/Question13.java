/* 13. Write a Java program to print the area and perimeter of a rectangle. 
Test Data:
Width = 5.5 Height = 8.5
Expected Output
Area is 5.6 * 8.5 = 47.60
Perimeter is 2 * (5.6 + 8.5) = 28.20 */

public class Question13 {
    public static void main(String[] args) {
    float width=5.6f;
    float height=8.5f;
    float area;            
    float peri;
    //     double width=5.6;
    //  double height=8.5;
    // double area;
    // double peri;
    area=width*height;
    System.out.println(area);
    peri=2*(width + height);
    System.out.println(peri);
    }
    
}
