import java.util.Scanner;

//public class Question5
//{
///  public static void main(String[] args)
//  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
/*    Scanner in = new Scanner(System.in);
    int i,m,n,j;
    int rounds = in.nextInt(), c;
    int[] a = new int[rounds];
    int[] b = new int[rounds];
    double sum=0;
    for (i=0; i<rounds; i++){
      //int userinput = in.nextInt();
      a[i] = in.nextInt();
    }
    for (i = 0; i<n; i++){
      c=1;
      if (a[i]==-1){
        b[i]=0;
      }
      else{
        for(j = i+1; j<n;j++){
          if (a[i] == a[j]){
            c++;
            a[j]=-1;
          }
        }
        b[i]=c;
      }
    m=b[0];
      for (i = 1; i<n; i++){
        if (b[i]>=m){
          m=b[i];
        }
      }
    }
    for (i = 0;i<n;i++){
      if (b[i] == m){
        System.out.println(a[i]);
      }
    }
  }
}
*/
public class Question5
{
   public static void main(String args[]) 
    { 
	
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt(),c;
	int [] a=new int[n];
	int [] b=new int[n];
	double sum=0;
	for(int i=0;i<n;i++) 
	{
		a[i]=sc.nextInt();
		
	}
	{
	for(int i=0;i<n;i++) 
	{   c=1;
          if(a[i]==-1)
           b[i]=0;
           else
           {
             for(int j=i+1;j<n;j++) 
	     {
		if(a[i]==a[j])
                  {
                      c++;
                      a[j]=-1;
                  }
                   
		
	      }
             b[i]=c;
            }
            
		
	}
        int m=b[0];
        for(int i=1;i<n;i++) 
	{
	    if(b[i]>=m)
                m=b[i];   
		
	}
        
	 for(int i=0;i<n;i++) 
	{
	    if(b[i]==m)
              System.out.println(a[i]);   
		
	}
        
	}
          
   }
}