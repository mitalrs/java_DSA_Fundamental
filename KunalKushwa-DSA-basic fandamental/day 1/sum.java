import java.util.Scanner;

class sum
{
    public static void main(String []args)
    {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter two numbers");
        int x= s.nextInt();
        int y= s.nextInt();

        int sum=x+y;
        System.out.println(sum);
    }
}