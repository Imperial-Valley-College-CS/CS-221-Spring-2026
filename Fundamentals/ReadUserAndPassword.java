import java.util.*;
import java.io.*;

public class ReadUserAndPassword
{
   public static void main(String[] args)
   {
      File f = new File("UserAndPass.txt");
      try
      {
         Scanner scan = new Scanner(f);
         String expectedUser = scan.nextLine();
         String expectedPass = scan.nextLine();
         
         System.out.println( expectedUser + " " + expectedPass);
      }catch( FileNotFoundException e )      //checked exception
      {
         System.out.println("File not found.");
      }
   }
}