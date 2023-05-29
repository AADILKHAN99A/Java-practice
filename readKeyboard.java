import java.lang.*;
import java.util.*;

class readKeyboard {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        String a;
        a = s.nextLine();
        System.out.println(a);

//check that number is integer or not
        boolean p = s.hasNextInt();
        System.out.println(p);

    }
}