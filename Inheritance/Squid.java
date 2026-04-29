public class Squid extends Invader
{
   private String[] squidFiles = {"/SquidMatrix.txt"};
   
   public Squid(double x, double y)
   {
      //must be first line of code in constructor
      super(x,y);    //reference to constructor of super class
      super.health = squidFiles.length;
   }
}