import java.util.Scanner;

public class recursion {
    public static int factorial(int num)
    {
        if(num==0)
            return 1;

        return num*factorial(num-1);
    }
    public static void main(String[] args) {


        int n;
        Scanner scan = new Scanner(System.in);
        n=scan.nextInt();
        int res =factorial(n);

        System.out.println(res);
    }



}
