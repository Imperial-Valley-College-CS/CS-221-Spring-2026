import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;

public class MakeButtonLive extends Application
{
   Button okBttn = new Button("OK");
   Button byeBttn = new Button("BYE");
   HBox horiBox = new HBox(okBttn, byeBttn);
   Scene scene = new Scene(horiBox);
   ButtonHandler handleButton = new ButtonHandler();

   //MUST override start method (inherited from Application)
   @Override
   public void start(Stage stage)
   {
      okBttn.setOnAction(handleButton);      //makes button come to live
      byeBttn.setOnAction(handleButton);      //makes button come to live
      stage.setScene(scene);
      stage.show();
   }
   
   //Write ButtonHandler because we need an EventHandler
   class ButtonHandler implements EventHandler<ActionEvent>
   {
      //MUST override handle method (inherited from EventHandler)
      @Override
      public void handle(ActionEvent e)
      {
         Button b = (Button)e.getSource();
         System.out.println( b.getText() );
      }
   }
}