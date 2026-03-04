import java.util.Scanner;

public class AscendingOrder
{
   public static void main(String[] args)
   {
      //Create Scanner Object for user input (only do it once)
      Scanner scan = new Scanner(System.in);
      
      System.out.print("Enter first integer: ");
      int num1 = scan.nextInt();
      System.out.print("Enter second integer: ");
      int num2 = scan.nextInt();
      System.out.print("Enter third integer: ");
      int num3 = scan.nextInt();
      
      System.out.print("Ascending Order: ");
      
      if( num1 < num2 && num1 < num3 )
      {
         System.out.print( num1 + ", ");
         if( num2 < num3 )
         {
            System.out.print( num2 + ", " + num3);
         }else
         {
            System.out.print( num3 + ", " + num2);
         }
      }
      
   }
}