//14. Write a Java program to print an American flag on the screen. 
// public class Question14 {
//     public static void main(String[] args) {
//         System.out.println("* * * * * * =========================");
//         System.out.println(" * * * * * ==========================");
//         System.out.println("* * * * * * =========================");
//         System.out.println(" * * * * * ==========================");
//         System.out.println("* * * * * * =========================");
//         System.out.println(" * * * * * ==========================");
//         System.out.println("=====================================");
//         System.out.println("=====================================");
//         System.out.println("=====================================");
//         System.out.println("=====================================");
//         System.out.println("=====================================");
//     }
// }

public class Question14 {
public static void main(String[] args) {
    String n1 = "* * * * * * ==================================\n * * * * *  ==================================";
  String n2 = "==============================================";

  for(int i=0; i<4; i++)
  {
      System.out.println(n1);
  }
  for(int i=0; i<6; i++)
  {
      System.out.println(n2);
  }
}  
}