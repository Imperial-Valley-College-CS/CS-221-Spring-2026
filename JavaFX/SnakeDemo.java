import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.animation.AnimationTimer;

public class SnakeDemo extends Application
{
   BorderPane pane = new BorderPane();
   Scene scene = new Scene(pane, 600, 400, Color.PURPLE);
   
   @Override
   public void start(Stage stage)
   {  
      stage.setScene(scene);
      stage.show();
   }
}