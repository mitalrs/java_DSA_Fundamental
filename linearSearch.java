import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
	    int []a ={10,20,30,40,50,60,70,80,90,100};
	    int c=0,n;
	    
	 Scanner s=new Scanner(System.in);
	  System.out.println("num for search");
	  n=s.nextInt();
	  
	  for(int i=0;i<a.length;i++)
	  {
	      if(n==a[i])
	     c++;
	  }
	  if(c==1)
	      System.out.println("exist");
	  else
	  	  System.out.println("not exist");

	 }
}