import java.util.Scanner;
class Nearest
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0;
        int b=1;
        int c=0;
        for(int i=2;c<n;i++)
        {
        c=a+b;
        a=b;
        b=c;
        }
        int dis1=Math.abs(n-a);
        int dis2=Math.abs(n-c);
        int res=dis1>dis2?c:a;
        if(dis1==dis2)
        System.out.println(a+" "+c);
        else
        System.out.println(res);
    }
}