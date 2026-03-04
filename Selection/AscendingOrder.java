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
   }
}