public class PerfectNumbers
{
   public static void main(String[] args)
   {
      int x = 0;
      while ( x <= 10000 )
      {
         boolean ans = isPerfect(x);
         if( ans )
            System.out.println( x );
            
         x++;
      }
   }
   
   public static boolean isPerfect( int num )
   {
      int sum = 0;
      int x = 1; 
      while( x <= num/2 )
      {
         if( num % x == 0 )
            sum = sum + x;
            
         x++;
      }
      
      if( num == sum && num != 0 )
         return true;
         
      return false;
   }
}