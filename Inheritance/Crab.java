import javafx.scene.paint.Color;

public class Crab extends Invader
{
   private String[] crabFiles = {"/CrabMatrix.txt", "/HurtCrabMatrix.txt"};
   
   public Crab( double x, double y )
   {
      super(x,y);
      super.health = this.crabFiles.length;
      super.color = Color.CRIMSON;    //CRIMSON
      super.filename = "InvaderMatrices" + crabFiles[0];
      setBody();
   }
}