import java.util.Scanner;

public class DistanceFormula
{
   public static void main(String[] args)
   {
      //Create a Scanner object to scan data from user
      Scanner scan = new Scanner(System.in);
      
      System.out.print("Enter location x1: ");
      double x1 = scan.nextDouble();
      System.out.print("Enter location y1: ");
      double y1 = scan.nextDouble();
      System.out.print("Enter location x2: ");
      double x2 = scan.nextDouble();
      System.out.print("Enter location y2: ");
      double y2 = scan.nextDouble();
      
      double dx = x2-x1;
      double dy = y2-y1;
      
      double a = dx*dx;
      double b = Math.pow(dy,2);
      
      double dist = Math.sqrt(a+b);
      
      System.out.printf("The distance between (%.2f,%.2f) and (%.2f,%.2f) is %.2f",x1,y1,x2,y2,dist);
      
   }//end main
}//end class