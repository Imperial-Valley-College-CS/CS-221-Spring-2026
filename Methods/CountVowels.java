import java.util.Scanner;

public class CountVowels
{
   public static void main(String[] args)
   {
      System.out.println( args[0] + " " + args[1] );
      Scanner scan = new Scanner(System.in);
      System.out.print("What is your favorite superhero? ");
      String supe = scan.nextLine();
      System.out.println( 2*countVowels("iron man") );
      int y = countVowels("batman");
      int z = countVowels("doctor strange");
      System.out.println( "Number of Vowels: " + " " + y + " " + z);
   }//end main
   
   public static int countVowels( String str )
   {
      int numVowels = 0;
      for( int i = 0; i < str.length(); i++ )
      {
         char let = str.toLowerCase().charAt(i);
         if( let == 'a' || let == 'e' || let == 'i' || let == 'o' 
            || let == 'u' )
         {
            numVowels++;  
         }
      }
      return numVowels;
   }//end countVowels
}//end class