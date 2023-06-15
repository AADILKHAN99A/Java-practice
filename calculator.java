import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {

            System.out.println("1.Add\n2.Sub\n3.Mul\n4.Div\n0.exit");
            int i = scan.nextByte();

            if (i == 0) {
                System.out.println("Exiting........");
                break;
            } else {
                System.out.println("Enter two numbers: ");
                float num1 = scan.nextFloat(), num2 = scan.nextFloat();
                float result;
                switch (i) {
                    case 1:
                        result = num1 + num2;
                        System.out.println(result);
                        break;
                    case 2:
                        result = num1 - num2;
                        System.out.println(result);
                        break;
                    case 3:
                        result = num1 * num2;
                        System.out.println(result);
                        break;
                    case 4:
                        result = num1 / num2;
                        System.out.println(result);
                        break;

                    default:
                        System.out.println("Wrong input");
                }
            }

        }
    }
}
