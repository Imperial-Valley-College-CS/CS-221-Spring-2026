import javafx.scene.paint.Color;

public class Squid extends Invader
{
   private String[] squidFiles = {"/SquidMatrix.txt"};
   
   public Squid(double x, double y)
   {
      //must be first line of code in constructor
      super(x,y);    //reference to constructor of super class
      super.health = squidFiles.length;
      super.color = Color.rgb(181, 57, 184);    //purple
      super.filename = "InvaderMatrices" + squidFiles[0];
      setBody();
   }
}