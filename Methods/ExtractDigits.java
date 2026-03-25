public class ExtractDigits
{
   public static void main(String[] args)
   {
      int rev = reverse(1258);
      System.out.println( rev );
   }
   
   public static int reverse(int num)
   {
      int newNum = 0;
      while( num > 10 )
      {
         newNum = (newNum + num % 10 ) * 10;
         num = num/10;
      }
      return newNum + num;
   }
}