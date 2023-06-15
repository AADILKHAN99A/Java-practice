import java.util.Scanner;

public class numbersInWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        String rem;
        String word = "";
        String result = "";
        while (number > 0)
        {
            rem = String.valueOf(number % 10);

            switch (rem) {
                case "0":
                    word = "zero ";
                    break;
                case "1":
                    word = "one ";
                    break;
                case "2":
                    word = "two ";
                    break;
                case "3":
                    word = "three ";
                    break;
                case "4":
                    word = "four ";
                    break;
                case "5":
                    word = "five ";
                    break;
                case "6":
                    word = "six ";
                    break;
                case "7":
                    word = "seven ";
                    break;
                case "8":
                    word = "eight ";
                    break;
                case "9":
                    word = "nine ";
                    break;
                default:
                    System.out.println("Error");
                    break;
            }
            result = word.concat(result);

            number = number / 10;
        }
        result = result.toUpperCase();
        System.out.println(result);
    }
}
