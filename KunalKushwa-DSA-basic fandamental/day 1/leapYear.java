import java.util.*;

public class leapYear 
{
   public static void main(String[]args)
   {
    Scanner s=new Scanner(System.in);
    int n= s.nextInt(); 
    System.out.println(n);

    // int n=1904;
    if((n%400==0) || (n%4==0 && n%100!=0)) 
    {
            System.out.println("This is a leap year!");
    }
    else{
        System.out.println("This is not a leap year!"); 
    }

    //   if(n%4==0)
    //   {
    //     if(n%100==0)
    //     {
    //         if(n%400==0)
    //         {
    //             System.out.println("leap year");
    //         }
    //         else{
    //             System.out.println("not leap year"); 
    //         }
    //     }
    //     else{
    //         System.out.println("leap year");
    //     }
    //   }
    //   else{
    //     System.out.println("not leap year");
    //   }
   } 
}
