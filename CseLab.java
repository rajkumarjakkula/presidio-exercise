import java.util.*;

public class CseLab {
    public static void main(String[] args)
    {
        int a[]=new int[3];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<3;i++)
        {
            a[i]=sc.nextInt();
        }
        int n=sc.nextInt();
        int min=10000,lab=0;
        int flag=1;
        for(int i=0;i<3;i++)
        {
            if(a[i]-n<min)
            {
                if(a[i]>=n){
                min=a[i]-n;
                flag=0;
                lab=i+1;}
            }
        }
        if(flag==0)
        {
            System.out.println("lab"+lab);
        }
        else
        {
            System.out.println("no lab available");
        }
    }
}
