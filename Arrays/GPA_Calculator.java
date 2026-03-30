import java.util.Scanner;

public class GPA_Calculator
{
   public static void main(String[] args)
   {
      //Prompt user for number of classes and grades in those classes
      //create array with grades
      //main will invoke (or call) calcGPA
      Scanner scan = new Scanner(System.in);
      System.out.print("How many classes are you taking? ");
      int numClasses = scan.nextInt();
      char[] grades = new char[numClasses];
      
      for(int i = 0; i < grades.length; i++ )
      {
         System.out.print("Enter grade of next class: " );
         grades[i] = scan.next().toUpperCase().charAt(0);
      }
      
      double gpa = calcGPA(grades);
      System.out.println( gpa );
   }
   
   public static double calcGPA(char[] arr)
   {
      //calcGPA will traverse arr to add all grade points 
         //and divide their sum by length of array
      //calcGPA will return the average of the elements (gpa)
      double sum = 0.0;
      for( int i = 0; i < arr.length; i++ )
      {
         switch(arr[i])
         {
            case 'A': sum += 4.0; break;
            case 'B': sum += 3.0; break;
            case 'C': sum += 2.0; break;
            case 'D': sum += 1.0; break;
         }
      }
      return sum/arr.length;
   }
}