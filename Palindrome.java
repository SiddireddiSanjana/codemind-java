import java.util.Scanner;
class Palindrome
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r,sum=0,t=n;
        while(n>0)
        {
            r=n%10;
            sum=sum*10+r;
            n=n/10;
        }
        if(sum==t)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}