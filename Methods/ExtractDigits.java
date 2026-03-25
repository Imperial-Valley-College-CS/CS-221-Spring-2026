public class ExtractDigits
{
   public static void main(String[] args)
   {
      
   }
   
   public static int reverse(int num)
   {
      while( num > 0 )
      {
         System.out.println( num % 10 );
         num = num/10;
      }
      return 0;
   }
}