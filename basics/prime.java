   //prime number
   import java.util.*;
   public class Main
   {
       public static void main(String[] args) 
       { 
           int n, c=0;
           Scanner s=new Scanner(System.in);
         System.out.println("num for search");
         n=s.nextInt();
         
         for(int i=2;i<n;i++)
     {
         if(n%i==0)
         {
             c=1;
             break;
         }
     }
     if(c==1)
     {
         System.out.println("not prime");
     }
     else
     {
         System.out.println("prime");
     }
         
       }
   }
  




