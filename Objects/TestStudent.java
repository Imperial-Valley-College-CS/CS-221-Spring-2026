public class TestStudent
{
   public static void main(String[] args)
   {
      Student stu = new Student("Liv Jackson", "12-3-1998", 3.68);
      stu.displayInfo();
      stu.setName("Liv Phillips");
      stu.displayInfo();
      System.out.println( stu.getGPA() );
   }
}