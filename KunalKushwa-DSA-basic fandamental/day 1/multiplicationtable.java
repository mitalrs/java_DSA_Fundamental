import java.util.Scanner;

public class multiplicationtable 
{
    public void main(String []args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number for table");
        int x=s.nextInt();
        for(int i=1;i<=10;i++)
        {
            int t=i*x;
            System.out.println(t+"="+i+"*"+x);
        }
    }
    
}
