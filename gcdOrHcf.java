import java.util.Scanner;

public class gcdOrHcf {
    public static int gcd(int a, int b)
    {if(a==0)
        return b;

     if(b==0)
         return a;

     while(a!=b)
     {
         if(a>b)
         {
             a=a-b;
         }
         else {
             b=b-a;
         }
     }
     return a;

    }
    public static void main(String[] args) {
        int a,b;
        Scanner scan = new Scanner(System.in);
        a=scan.nextInt();
        b=scan.nextInt();

        int ans = gcd(a,b);
        System.out.println(ans);

    }
}
