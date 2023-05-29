import java.lang.*;
import java.util.*;

class radix {
    public static void main(String arg[]) {
        Scanner s = new Scanner(System.in);
        s.useRadix(2);     // base or radix

        System.out.println(s.nextInt());    // take input and than print output using base
    }
}