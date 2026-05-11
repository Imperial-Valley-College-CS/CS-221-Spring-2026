import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;

public class App extends Application
{
   private Card[] deck = new Card[52];
   private String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
   private String[] suits = {"C", "D", "H", "S"};
   Group g = new Group();        //Group is a Parent
   Scene scene = new Scene(g);    //scene has no zero-arg constructor (Scene needs a Parent)
   
   //inherit start method from Application class - must be overridden
   @Override
   public void start(Stage stage)
   {
      createDeck();
      g.getChildren().add( deck[51].getImView() );
      stage.setScene( scene );
      stage.show();     //stage needs a scene
   }
   
   
   public void createDeck()
   {
      int j = 0;        //index value of ranks
      int k = 0;        //index value of suits
      for( int i = 0; i < deck.length; i++ )
      {
         deck[i] = new Card(ranks[j], suits[k]);
         j++;
         if( i == 12 || i == 25 || i == 38 )    //try (i-k)%12 == 0
         {
            j = 0;      //reset j back to 0
            k++;        //increment k by 1
         }
      }
      
      for( Card c : deck )
         System.out.println( c );
   }
}