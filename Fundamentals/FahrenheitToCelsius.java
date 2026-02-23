public class FahrenheitToCelsius
{
   public static void main(String[] args)
   {
      double degF = 109.5;
      
      double degC = (5.0/9)*(degF-32);
      
      System.out.printf("%.1f degF is %.1f degC",degF,degC);
      
   }
}