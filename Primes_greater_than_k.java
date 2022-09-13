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
       int arr[]=new int[n];
       for(int i=0;i<n;i++)
       {
           arr[i]=sc.nextInt();
       }
           int m=sc.nextInt();
           int count=0;
           for(int j=0;j<n;j++)
           {
               if(isPrime(arr[j])&&arr[j]!=1&&arr[j]>=m)
               {
                  
               count++;
           }
       }
        System.out.println(count);
    }
}