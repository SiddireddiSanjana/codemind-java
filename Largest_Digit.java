import java.util.Scanner;
class Sample
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int m=-1;
		while(n>0)
		{
		   int r=n%10;
		    m=Math.max(m,r);
		    n=n/10;
		}
		System.out.println(m);
	}
}