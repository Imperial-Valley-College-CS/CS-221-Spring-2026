import java.util.Scanner;

public class QuadraticFormula
{
   public static void main(String[] args)
   {
      //Create Scanner Object for user input (only do it once)
      Scanner scan = new Scanner(System.in);
      
      System.out.print("Enter coefficient \"a\": ");
      int a = scan.nextInt();
      System.out.print("Enter coefficient \"b\": ");
      int b = scan.nextInt();
      System.out.print("Enter coefficient \"c\": ");
      int c = scan.nextInt();
      
      double discriminant = b*b-4*a*c;
      
      if( discriminant > 0 )
      {
         //code here for two roots
      }else if( discriminant == 0 )
      {
         //code here for one root
      }else if( discriminant < 0 )
      {
         System.out.println( "Equation has no real roots.");
      }
   }
}