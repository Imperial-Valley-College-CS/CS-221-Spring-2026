import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Card
{
   private String rank, suit;    //5-C (rank = 5, suit = C)
   private Image image;
   private ImageView imageView;
   
   public Card(String r, String s)
   {
      this.rank = r;
      this.suit = s;
      this.image = new Image("cards/"+this.rank + "-" + this.suit + ".png");
      this.imageView = new ImageView(image);
   }
   
   public ImageView getImView()
   {
      return this.imageView;
   }
   
   @Override
   public String toString()
   {
      return this.rank + "-" + this.suit;
   }
}