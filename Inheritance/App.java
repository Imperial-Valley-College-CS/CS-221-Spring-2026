// package PA13_Inheritance.src.test.java;
// 
// import PA13_Inheritance.src.main.java.*;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.ArrayList;

import javafx.scene.*;
import javafx.scene.canvas.*;
import javafx.scene.paint.*;


public class App extends Application
{
   private int WIDTH = 600;
   private int HEIGHT = 400;
   private int SCALE = 10;
   private int dx = 14*SCALE;
   private int dy = 10*SCALE;
   private int x = 2*SCALE;
   private int y = 2*SCALE;
   private Group root = new Group();
   private Scene scene = new Scene(root, WIDTH, HEIGHT, Color.BLACK);
   private Canvas canvas = new Canvas(WIDTH, HEIGHT);
   private GraphicsContext gc = canvas.getGraphicsContext2D();
   
   private ArrayList<Invader> invaders = new ArrayList<>();
   
   @Override
   public void start( Stage stage )
   {
      addFormation();
      renderCanvas();
      root.getChildren().add( canvas );
      stage.setScene( scene );
      stage.show();
   }
   
   private void addFormation()
   {
      invaders.add( new Squid(x, y) );
      invaders.add( new Crab(x+dx, y) );
      invaders.add( new Octopus(x+2*dx, y) );  
      
      invaders.add( new Crab(x+dx, y+dy) );
      invaders.get(3).hit();
      invaders.add( new Octopus(x+2*dx, y+dy) );
      invaders.get(4).hit();     
      
      invaders.add( new Octopus(x+2*dx, y+2*dy) );
      invaders.get(5).hit();
      invaders.get(5).hit();        
   }
   
   private void renderCanvas()
   {
      gc.setFill( Color.BLACK );
      gc.fillRect( 0, 0, WIDTH, HEIGHT );
      
           
      for( Invader vader : invaders )
      {         
         if( vader.alive() )
            drawInvader( vader );
      }
      
   }
   
     
   private void drawInvader( Invader vader )
   {
      gc.setFill( vader.getColor() );
      boolean[][] body = vader.getBody();
      double x = vader.getPosition().getX();
      double y = vader.getPosition().getY();
      helperDrawer( body, x, y );
   }   
   
   private void helperDrawer( boolean[][] body, double x, double y )
   {
      double savedX = x;
      for( boolean[] row : body )
      {
         for( boolean b : row )
         {
            if( b )
            {
               gc.fillRect(x, y, SCALE, SCALE);
            }
            x += SCALE;
         }
         x = savedX;
         y += SCALE;
      }
   }
   
}