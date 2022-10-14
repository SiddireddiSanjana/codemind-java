import java.util.*;
class Code
{
    public static void main(String args[])
    {
        int C;
        double F;
        Scanner s=new Scanner(System.in);
        C=s.nextInt();
        F=C*1.8000+32.00;
        System.out.format("%.2f",F);
    }
}