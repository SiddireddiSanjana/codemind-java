import java.util.Scanner;
class pattern
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int row_size,out,in;
        row_size=sc.nextInt();
        for(out=row_size;out>=1;out--)
        {
            for(in=row_size;in>=1;in--)
            System.out.print(in+" ");
            System.out.println();
        }
        sc.close();
    }
}