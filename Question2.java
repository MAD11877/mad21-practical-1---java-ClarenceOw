import java.util.Scanner;

public class Question2
{
  public static void main(String[] args)
  {
    /**
     * Prompts user for height and weight, calculate and print out the BMI of the user
     * 
     * Hint: in.nextDouble() to read double
     */
     
    Scanner in = new Scanner(System.in);
    System.out.print("Enter height in m: ");
    double height = in.nextDouble();

    System.out.print("Enter Weight in kg: ");
    double weight = in.nextDouble();

    double bmi = weight / (height * height);


    System.out.println();
    System.out.println();
    System.out.println("Your Height is: " + height + "m");
    System.out.println("Your Weight is: " + weight + "kg");
    System.out.println("Your BMI is: " + bmi);
  }
}
