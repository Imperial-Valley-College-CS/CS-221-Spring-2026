public class Crab extends Invader
{
   private String[] crabFiles = {"/CrabMatrix.txt", "/HurtCrabMatrix.txt"};
   
   public Crab( double x, double y )
   {
      super(x,y);
      super.health = this.crabFiles.length;
   }
}