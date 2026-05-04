import javafx.scene.paint.Color;

public class Octopus extends Invader
{
   private String[] octopusFiles = {"/OctopusMatrix.txt", "/HurtOctopusMatrix.txt", "/DamagedOctopusMatrix.txt"};
   
   public Octopus( double x, double y )
   {
      super(x,y);
      super.health = this.octopusFiles.length;
      super.color = Color.RED;    //red
      super.filename = "InvaderMatrices" + octopusFiles[0];
      setBody();
   }
}