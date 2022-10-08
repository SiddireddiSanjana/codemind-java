import java.util.*;
class Sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        
        int n,x[],i,A,sum=0,c=0;
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
           {
             x[i]=sc.nextInt();  
           } 
      for(i=0;i<n;i++)
      {
          sum=sum+x[i];
      }
      A=sum/n;
      for(i=0;i<n;i++)
      {
          if(x[i]<=A)
           c++;
      }
      System.out.println(c);
    }
}