import javafx.scene.paint.Color;

public class Octopus extends Invader
{
   private String[] octopusFiles = {"/OctopusMatrix.txt", "/HurtOctopusMatrix.txt", "/DamagedOctopusMatrix.txt"};
   
   public Octopus( double x, double y )
   {
      super(x,y);
      super.health = this.octopusFiles.length;
      super.color = Color.BLUE;    //red
      super.filename = "InvaderMatrices" + octopusFiles[0];
      setBody();
   }
   
   @Override
   public boolean hit()
   {
      if( super.hit() )      //invoke hit method from Invader
      {
         //reset body of invader
         int index = this.octopusFiles.length - super.health;     //3-1=2
         super.filename = super.matrixFolder + this.octopusFiles[index];
         setBody();
      }
      return super.isAlive;
   }
   
}