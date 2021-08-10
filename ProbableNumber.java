import java.util.Scanner;

public class ProbableNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=5;
        while(n!=0)
        {
            int num = sc.nextInt();
            int even = 0, digit, odd = 0, count = 0,rev=0;
            while (num != 0) {
                digit = num % 10;
                rev=rev*10+digit;
                num=num/10;
                count++;
            }
            int c=1;
            while(rev!=0)
            {
                digit=rev%10;
                if(c%2==0) even+=digit;
                else odd+=digit;
                rev=rev/10;
                c++;
            }
//            System.out.println("wdf"+even+odd);
            if(even==odd) System.out.println("Probable Number");
            else System.out.println("Not a Probable Number");
            n--;
        }
    }
}
