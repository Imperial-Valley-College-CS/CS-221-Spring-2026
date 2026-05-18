import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;

public class MakeMouseLive extends Application
{
   Group g = new Group();
   Scene scene = new Scene(g);
   MouseHandler handleMouse = new MouseHandler();

   //MUST override start method (inherited from Application)
   @Override
   public void start(Stage stage)
   {
      scene.setOnMouseClicked(handleMouse);      //this method makes mouse come to live
      stage.setScene(scene);
      stage.show();
   }
   
   //Write MouseHandler because we need an EventHandler
   class MouseHandler implements EventHandler<MouseEvent>
   {
      //MUST override handle method (inherited from EventHandler)
      @Override
      public void handle(MouseEvent e)
      {
         System.out.println( e.getX() + ", " + e.getY() );
      }
   }
}