import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.event.EventHandler;
import javafx.scene.input.KeyEvent;

public class MakeKeysLive extends Application
{
   Group g = new Group();
   Scene scene = new Scene(g);
   KeyHandler handleKeys = new KeyHandler();

   //MUST override start method (inherited from Application)
   @Override
   public void start(Stage stage)
   {
      scene.setOnKeyPressed(handleKeys);      //this method makes keys in keyboard come to live
      stage.setScene(scene);
      stage.show();
   }
   
   //Write KeyHandler because we need an EventHandler
   class KeyHandler implements EventHandler<KeyEvent>
   {
      //MUST override handle method (inherited from EventHandler)
      @Override
      public void handle(KeyEvent e)
      {
         System.out.println( e.getCode() );
      }
   }
}