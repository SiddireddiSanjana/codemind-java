import java.util.Scanner;
class sample
{
public static void main(String args[])
{
    int x[],i,n,k,count=0;
Scanner sc=new Scanner(System.in);

n=sc.nextInt();
x=new int[n];
k=sc.nextInt();
for(i=0;i<n;i++)
x[i]=sc.nextInt();
for(i=0;i<n;i++)
{
if(x[i]%k!=0)
count++;
}
System.out.print(count);
}
}