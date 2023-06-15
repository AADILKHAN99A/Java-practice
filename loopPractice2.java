import java.util.Scanner;

public class loopPractice2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int rem;
        int count = 0;
        while (number > 0) {
            rem = number % 10;
            number = number / 10;
            System.out.println(rem);
            count++;
        }
        System.out.println("number of digits is: " + count);

//      Armstrong number finder      (153= 1*1*1 + 5*5*5 + 3*3*3)

        int num = scan.nextInt();
        int temp = num;
        int sum = 0;
        rem = 0;
        while (num > 0) {
            rem = num % 10;
            sum = rem * rem * rem + sum;     // do not use math.pow() because it give double value which is not precise
            num = num / 10;
        }
        if (sum == temp) {
            System.out.println(temp + " is Armstrong number");
        } else {
            System.out.println(temp + " is not Armstrong number");
        }

        //       Reverse of Number

        number = scan.nextInt();
        int rev = 0;
        temp = number;

        while (number > 0) {
            rem = number % 10;
            rev = rev * 10 + rem;

            number = number / 10;

        }
        System.out.println("reverse of number is :" + rev+"\n");

        //     Palindrome Number

        if(rev==temp)
        {
            System.out.println("Number is palindrome");
        }
        else {
            System.out.println("Number is not palindrome");
        }

    }
}
