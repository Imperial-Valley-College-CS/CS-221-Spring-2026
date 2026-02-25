public class StringFormat
{
   public static void main(String[] args)
   {
      String hs = "Brawley High";
      double gpa = 3.64;
      boolean isOnlyChild = false;
      
      String str = String.format("High School: %s%nGPA: %.2f%nOnly Child: %b", hs, gpa, isOnlyChild);
      System.out.print( str );
   }//end main
}//end class