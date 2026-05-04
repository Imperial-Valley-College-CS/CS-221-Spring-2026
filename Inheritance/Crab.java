import javafx.scene.paint.Color;

public class Crab extends Invader
{
   private String[] crabFiles = {"/CrabMatrix.txt", "/HurtCrabMatrix.txt"};
   
   public Crab( double x, double y )
   {
      super(x,y);
      super.health = this.crabFiles.length;
      super.color = Color.CRIMSON;    //CRIMSON
      super.filename = super.matrixFolder + crabFiles[0];
      setBody();
   }
   
   @Override
   public boolean hit()
   {
      if( super.hit() )      //invoke hit method from Invader
      {
         //reset body of invader
         int index = this.crabFiles.length - super.health;
         super.filename = super.matrixFolder + this.crabFiles[index];
         setBody();
      }
      return super.isAlive;
   }
}