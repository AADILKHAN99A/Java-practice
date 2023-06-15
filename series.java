import java.util.Scanner;

public class series {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //        AP Series

        int a = scan.nextInt();
        int d= scan.nextInt();
        int number =scan.nextInt();
        int result =0;

        for(int i =1;i<=number;i++)
        {
            result=(a+(i-1)*d);
            System.out.print(result+",");
        }
        System.out.println("\n");


        //          GP Series

        a = scan.nextInt();
        d= scan.nextInt();
        number= scan.nextInt();

        for(int i =1;i<=number;i++)
        {
            System.out.print(a+",");
            a = a*d;
        }
        System.out.println("\n");


        //         Fibonacci Series

        number = scan.nextInt();
        a =0;
        int b =1;
        int fibo;
        System.out.print(a+","+b+",");
        for(int r = 0;r<number-2;r++)
        {
            fibo = a+b;
            System.out.print(fibo+",");
            a=b;
            b= fibo;


        }


    }

}
