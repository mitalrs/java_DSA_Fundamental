//perfect number
import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{ 
	    int prf=0, n;
	    Scanner s=new Scanner(System.in);
	  System.out.println("num for search");
	  n=s.nextInt();
	  
	  
	   for(int i=1;i<=n/2;i++)
       {
           if(n%i==0)
           {
               prf=prf+i;
           }
       }
       if(n==prf)
       {
              System.out.print("prf");
       }
        else
        {
            System.out.print("not prf");
        }
       
	}
}
