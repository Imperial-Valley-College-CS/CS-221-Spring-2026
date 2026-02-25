import java.util.Scanner;

public class UserInput
{
   public static void main(String[] args)
   {
      //Create Scanner Object for user input (only do it once)
      Scanner scan = new Scanner(System.in);
      
      System.out.print("What is your name? ");
      String yourName = scan.nextLine();
      
      System.out.print("How old are you? ");
      int yourAge = scan.nextInt();
      
      System.out.println( yourName );
      System.out.println( yourAge );
   }
}