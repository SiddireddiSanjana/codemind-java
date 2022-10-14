import java.util.Scanner;
class Array{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int sum=0;
        float avg;
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
            sum+=arr[i];
        }
        avg=(float)sum/n;
        System.out.format("%.2f",avg);
        
    }
}