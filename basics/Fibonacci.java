   //fibonacci series
   import java.util.*;
   public class Main
   {
       public static void main(String[] args) 
       { 
           int n, a=0,b=1,c;
           Scanner s=new Scanner(System.in);
         System.out.println("num for search");
         n=s.nextInt();
         
         
         for(int i=1;i<=n;i++)
         {
         c=a+b;
       System.out.print(" "+c);
       
        a=b;
        b=c;
         }
       }
   }
   