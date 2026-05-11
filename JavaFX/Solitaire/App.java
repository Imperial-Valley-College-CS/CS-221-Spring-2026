public class App
{
   private static Card[] deck = new Card[52];
   private static String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
   private static String[] suits = {"C", "D", "H", "S"};
   
   public static void main(String[] args)
   {
      createDeck();
   }
   
   public static void createDeck()
   {
      int j = 0;        //index value of ranks
      int k = 0;        //index value of suits
      for( int i = 0; i < deck.length; i++ )
      {
         deck[i] = new Card(ranks[j], suits[k]);
         j++;
         if( i == 12 || i == 25 || i == 38 )
         {
            j = 0;      //reset j back to 0
            k++;        //increment k by 1
         }
      }
      
      for( Card c : deck )
         System.out.println( c );
   }
}