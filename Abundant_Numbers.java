import java.util.Scanner;
class Abundant
{
    public static String isAbundant(int n)
    {
        int sum=1,i;
        for(i=2;i<=n/2;i++)
        {
           if(n%i==0)
           sum=sum+i;
        }
        if(sum>n)
        return "True";
        else
        return "False";
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print(isAbundant(n));
        sc.close();
    }
    
}