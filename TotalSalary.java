import java.util.Scanner;

public class TotalSalary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=7,total=0;
        float sal=0;
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            total+=a[i];
        }
        for(int i=0;i<n;i++)
        {
            int extrahour=a[i]-8;
            float extraSal=0;
            if(extrahour>0) extraSal=(a[i]-8)*15;
            float salOnDay=a[i]*100+extraSal;
            sal+=salOnDay;
            if(i==0 && a[i]>0) sal+=sal*0.5;
            if(i==6 && a[i]>0) sal+=sal*0.25;
            if(total>40) sal+=(total-40)*25;
        }
        System.out.println("Total Salary is: "+sal);

    }
}
