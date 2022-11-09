import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,x=0,y=1,sum=0;
        n=sc.nextInt();
        System.out.print(x+" "+y+" ");
        for(int i=2;i<n;i++)
        {
            sum=x+y;
            x=y;
            y=sum;
            System.out.print(sum+" ");
        }
    }
}