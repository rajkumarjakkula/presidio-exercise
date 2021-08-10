import java.util.Scanner;

public class CollatzProblem {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Collatz Sequence:(output)");
        System.out.println(n);
        while(n!=1)
        {
         if(n%2==0) {
             n = n / 2;
             System.out.println(n);
         }
         else
         {
             n=3*n+1;
             System.out.println(n);
         }
        }
    }
}
