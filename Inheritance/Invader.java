import javafx.scene.paint.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Invader
{
   protected int health, speedX, speedY;
   protected Color color;
   protected boolean[][] body;
   protected boolean isAlive;
   protected Position pos;
   protected String filename;
   
   public Invader(double x, double y)
   {
      this.pos = new Position(x,y);
      this.color = Color.GREEN;
      this.isAlive = true;
      this.speedX = 2;
      this.speedY = 4;
   }
   
   public void setBody()
   {
      File f = new File( filename );
      try
      {
         Scanner scan = new Scanner(f);
         int row = 0;
         while( scan.hasNextLine() )
         {
            int col = 0;
            String[] nextLine = scan.nextLine().split(",");
            for( String s : nextLine )
            {
               body[row][col] = s.equals("1");
               col++;
            }
            row++;
         }         
      }catch( FileNotFoundException e )
      {
         System.out.println( filename + " not found." );
      }
   }//end setBody
}