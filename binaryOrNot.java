import java.lang.*;
import java.util.*;
public class binaryOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value to check binary or not");
        int number = sc.nextInt();
        String str = String.valueOf(number);


        boolean check = str.matches("[01]+");
        if (check)
        {
            System.out.println(number+" "+ "is binary");
        }

        else
        {
            System.out.println(number+" "+ "is not binary");
        }

        System.out.println("Enter a value to check hexadecimal or not");
        str =sc.next();

        check = str.matches("[0-9A-F]+");

        if(check)
        {
            System.out.println(str+" "+"is Hexadecimal");
        }
        else {
            System.out.println(str+" "+"is not Hexadecimal");
        }

        System.out.println("Enter date in format dd/mm/yyyy");
        str = sc.next();
        check=str.matches("[0-3][0-9]/(0[1-9]|1[012])/[0-9]{4}");


        if(check)
        {
            System.out.println(str+" "+"date is right");
        }
        else {
            System.out.println(str+" "+"date is not right");
        }



    }
}
