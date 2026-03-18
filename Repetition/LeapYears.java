public class LeapYears
{
   public static void main(String[] args)
   {
      int startYear = 2024;      //entered by user
      int endYear = 2110;        //entered by user
      
      for( int year = startYear; year <= endYear; year++ )
      {
         if( year%400 == 0 || (year%4 == 0 && year%100 != 0))
         {
            System.out.println( year + " is a leap year.");
         }
      }
   }
}