import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        for(int i=1;i<=k;i++)
        {
            if(i%2!=0) 
            {
                System.out.println(n+" x "+i+" = "+n*i);
            }
        }
    }
}