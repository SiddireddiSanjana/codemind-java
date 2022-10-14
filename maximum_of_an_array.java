import java.util.*;
class Sample
{
    public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
	  int arr[],n,i;
	  n=sc.nextInt();
	  arr=new int[n];
	  for(i=0;i<n;i++)
	     arr[i]=sc.nextInt();
       Arrays.sort(arr); 
       System.out.println(arr[n-1]);
   }
}