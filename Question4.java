import java.util.Scanner;

public class Question4
{
  public static void main(String[] args)
  {
    /**
     * Prints a right angle triangle with *. The base of the triangle depends on the integer given.
     *    e.g.
     *     > 5
     *     *****
     *     ****
     *     ***
     *     **
     *     *
     * 
     * Hint: 2 loops are required. System.out.print(...) to print on single line.
     */
     
    Scanner in = new Scanner(System.in);
    //System.out.print("Enter number of rows:");
    int i,j;
    int rows = in.nextInt();

    for (i=1; i<=rows; i++){
      for (j=rows;j>=i;j--){
        System.out.print("*");
      }
      System.out.println();
    }
    
  }
}
