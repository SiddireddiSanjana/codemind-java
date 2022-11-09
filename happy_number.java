import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0,temp=n;
        while(temp>9)
        {
            while(temp>0)
            {
                int rev=temp%10;
                    sum=sum+(int)Math.pow(rev,2);
                    temp=temp/10;
            }
            temp=sum;
            sum=0;
        }
        if(temp==1)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}