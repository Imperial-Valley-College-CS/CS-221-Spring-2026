public class TwoDimArrays
{
   public static void main(String[] args)
   {
      int[][] arr = {{3,1,12}, {4,18,7},{28,5,9}};
      int largest = locateLargest( arr );
      System.out.println( largest );
   }
   
   public static int locateLargest(int[][] nums)
   {
      int biggestNum = nums[0][0]; 
      for( int i = 0; i < nums.length; i++ )
      {
         for( int j = 0; j < nums[i].length; j++ )
         {
            if( nums[i][j] > biggestNum )
            {
               biggestNum = nums[i][j];
            }
         }
      }
      
      return biggestNum;
   }
}