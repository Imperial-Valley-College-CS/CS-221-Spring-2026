import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;

public class AddImageToApp extends Application
{
   BorderPane pane = new BorderPane();
   Scene scene = new Scene(pane, 600, 400, Color.PURPLE);
   Image image = new Image("minecraftGang.png");
   ImageView imView = new ImageView(image);
   
   @Override
   public void start(Stage stage)
   {  
      pane.setCenter(imView);
      stage.setScene(scene);
      stage.show();
   }
}