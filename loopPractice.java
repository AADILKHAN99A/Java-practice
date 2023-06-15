import java.util.Scanner;

public class loopPractice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //  multiplication table diplay
        int n = scan.nextInt();

        for(int i = 1;i<=10;i++)
        {
            System.out.println(n+"x"+i+"="+n*i);
        }

        //  sum of n numbers

        int num = scan.nextInt();
        int sum = 0;
        for(int i =1;i<=num;i++)
        {
            sum=sum+i;
        }
        System.out.println(sum);

        // factorial finder
        int number = scan.nextInt();
        long factorial=1;
        for(int i =1;i<=number;i++)
        {
         factorial=factorial*i;
        }
        System.out.println(factorial);

    }
}
