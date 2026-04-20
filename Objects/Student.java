public class Student
{
   //data fields - a variable (primitive or reference, static or non-static)
   private String name, dob, school, major, gender;
   private double gpa;
   private int units, age;
   private boolean graduated;
   
   //constructor(s) - are invoked when new Student is created
   public Student(String n)
   {
      this.name = n;
   }
   
   public Student(String n, String db, double gp)
   {
      this.name = n;
      this.dob = db;
      this.gpa = gp;
   }
   //method(s)
   public void setName(String newName)
   {
      this.name = newName;
   }
   
   public double getGPA()
   {
      return this.gpa;
   }
   
   public void displayInfo()
   {
      System.out.println("Name: " + this.name );
      System.out.println("DOB: " + this.dob );
      System.out.println("GPA: " + this.gpa );      
   }
}