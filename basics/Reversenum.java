import java.util.*;
class rev
{
    public static void main(String...args)
    {
        int n;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        int rem,rev=0;
        while(n!=0)
        {
            rem=n%10;
            rev=rev*10+rem;
            n/=10;
        }
        System.out.print(rev);
    }
}