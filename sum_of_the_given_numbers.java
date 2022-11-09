import java.util.Scanner;
class Sum
{
    public static int sum(int a,int b)
    {
        return a+b;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            System.out.println(sum(a,b));
        }
    }
}