import java.util.Scanner;
class Palindrome
{
    public static boolean isPalindrome(int n)
    {
        int r,rev=0,t=n;
        while(n>0)
        {
            r=n%10;
            rev=rev*10+r;
            n=n/10;
        }
        if(t==rev)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,a;
        n=sc.nextInt();
        while (n>0)
        {
            a=sc.nextInt();
            if(isPalindrome(a))
            {
                System.out.println("True");
            }
            else
            {
                System.out.println("False");
            }
            n=n-1;
        }
    }
}