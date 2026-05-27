import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.animation.AnimationTimer;

public class StartAnimationTimer extends Application
{
   BorderPane pane = new BorderPane();
   Scene scene = new Scene(pane, 600, 400, Color.PURPLE);
   Timer timer = new Timer();    //create Timer object
   
   @Override
   public void start(Stage stage)
   {  
      timer.start();       //activate handle method in Timer
      stage.setScene(scene);
      stage.show();
   }
   
   //AnimationTimer is an abstract class (it has an abstract method - handle(long) )
   class Timer extends AnimationTimer
   {
      //inherited abstract methods MUST be overriden
      @Override
      public void handle(long now)     //handle is invoked on every computational frame
      {
         System.out.println( now );
      }
   }
}