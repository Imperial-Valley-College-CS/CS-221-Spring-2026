import java.util.Scanner;

public class CountVowels
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      System.out.print("What is your favorite superhero? ");
      String supe = scan.nextLine();
      
      int numVowels = 0;
      for( int i = 0; i < supe.length(); i++ )
      {
         char let = supe.toLowerCase().charAt(i);
         if( let == 'a' || let == 'e' || let == 'i' || let == 'o' 
            || let == 'u' )
         {
            numVowels++;  
         }
      }
      System.out.println( "Number of Vowels: " + numVowels );
   }
}