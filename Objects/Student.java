public class Student
{
   //data fields - a variable (primitive or reference, static or non-static)
   private String name, dob, school, major, gender;
   private double gpa;
   private int units, age;
   private boolean graduated;
   private char[] grades;
   
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
   //setters
   public void setName(String newName){ this.name = newName; }
   public void setGrades( char[] ga ){ this.grades = ga; }   
   public void setMajor(String ma){ this.major = ma; }
   //getters
   public double getGPA()
   { 
      calcGPA();
      return this.gpa; 
   }
   
   //method(s)
   public void displayInfo()
   {
      System.out.println("Name: " + this.name );
      System.out.println("DOB: " + this.dob );
      System.out.println("GPA: " + this.gpa );      
   }
   
   private void calcGPA()
   {
      double sum = 0;
      for( char g : this.grades )      
         switch(g)
         {
            case 'A': case 'a': sum += 4.0; break;
            case 'B': case 'b': sum += 3.0; break;
            case 'C': case 'c': sum += 2.0; break;
            case 'D': case 'd': sum += 1.0; break;
         }
      
      this.gpa = sum/this.grades.length;
   }
}