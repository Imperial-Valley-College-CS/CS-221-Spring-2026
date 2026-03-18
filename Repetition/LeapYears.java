public class LeapYears
{
   public static void main(String[] args)
   {
      int year = 1978;
      
      if( year%400 == 0 || (year%4 == 0 && year%100 != 0))
      {
         System.out.println( year + " is a leap year.");
      }
   }
}