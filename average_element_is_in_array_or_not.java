import java.util.Scanner;
class Sample
{
    public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
	  
	 int n=sc.nextInt();
	 int arr[]=new int[n];
	 for(int i=0;i<n;i++)
	     arr[i]=sc.nextInt();
	 int avg=0;
	 for(int ele: arr)
	    avg+=ele;
	 avg=avg/n;
	 int count=0;
	 for(int i=0;i<n;i++)
	 {
	     if(arr[i]==avg)
	        count++;
	 }
	 if(count>0)
	    System.out.println("True");
	  else
	    System.out.println("False");
   }
}