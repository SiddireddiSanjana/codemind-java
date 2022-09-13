import java.util.Scanner;
class sample
{
    public static boolean isPrime(int n)
    {
       for(int i=2;i<=(int)Math.sqrt(n);i++)
{
    if(n%i==0)
    return false;
}
return true;
}
public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
     int   n=sc.nextInt();
       int arr1[]=new int[n];
       float sum=0;
       int count=0;
       for(int i=0;i<n;i++)
       {
           arr1[i]=sc.nextInt();
           if(isPrime(arr1[i])&&arr1[i]!=1)
           {
               sum=sum+arr1[i];
               count++;
           }
       }
        System.out.format("%.2f",sum/count);
    }
}