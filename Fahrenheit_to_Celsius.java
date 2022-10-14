import java.util.*;
class Code
{
    public static void main(String args[])
    {
        double C;
        double F;
        Scanner s=new Scanner(System.in);
        F=s.nextInt();
        C=((F-32)*5)/9;
        System.out.format("%.2f",C);
    }
}