import java.util.Scanner;

public class tillx {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Entered x");
        int x=s.nextInt();
        int sum=0;
        System.out.println("Entered up to x");
        for(int i=1;i<=x;i++)
        {
            int z=s.nextInt();
            sum+=z;
           // System.out.println(sum);
        }
        System.out.println(sum);
    }
}
