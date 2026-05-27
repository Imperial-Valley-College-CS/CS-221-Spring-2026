public class Block
{
   //data fields
   private int x, y;
   
   //constructer
   public Block( int x, int y )
   {
      this.x = x;
      this.y = y;
   }
   
   //setter methods
   public void setX( int x ){ this.x = x; }
   public void setY( int y ){ this.y = y; }
   
   //getter methods
   public int getX(){ return this.x; }
   public int getY(){ return this.y; }
}