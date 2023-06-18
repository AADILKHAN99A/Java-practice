import java.util.Arrays;
import java.util.stream.IntStream;

public class primeOrNot {
    public static void main(String[] args) {



        //    Check that number is prime or not
        int number = 5;
        int flag = -1;

        if (number <= 1) {
            System.out.println("number is not prime");
            System.exit(0);
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                flag = 1;
                break;
            }
        }
        if (flag == 1) {
            System.out.println("number is not prime");
        } else {
            System.out.println("Number is prime");

        }

        //    all prime numbers less then number

    int num=40,count=0;
    boolean []A = new boolean[num];
    Arrays.fill(A,true);    // fill whole array 'A' with true value
    A[0]=false;A[1]=false;

    for(int i=2;i<num;i++)
    {
        if(A[i])
        {
            count++;
            for(int j = 2*i;j<num;j=j+i)
            {
                A[j]=false;
            }
        }

    }
        System.out.println(count);



    }
}
