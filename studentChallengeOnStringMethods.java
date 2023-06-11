import java.util.*;

public class studentChallengeOnStringMethods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your email: ");
        String str = sc.nextLine();

        boolean check = str.matches("\\w*@gmail.com");
        int index = str.indexOf("@");

        if (index == -1) {
            System.out.println("wrong email");

        }

        else {
            int size = str.length();
            String username, domain;

            if (check) {
                System.out.println("Your email is gmail");
                username = str.substring(0, index);
                domain = str.substring(index, size);
            } else {
                System.out.println("Your email is Not gmail");
                username = str.substring(0, index);
                domain = str.substring(index, size);
            }

            System.out.println("username: " + username);
            System.out.println("Domain: " + domain);

        }
    }
}
