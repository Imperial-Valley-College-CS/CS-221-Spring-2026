public class Card
{
   private String rank, suit;    //5-C (rank = 5, suit = C)
   
   public Card(String r, String s)
   {
      this.rank = r;
      this.suit = s;
   }
   
   @Override
   public String toString()
   {
      return this.rank + "-" + this.suit;
   }
}