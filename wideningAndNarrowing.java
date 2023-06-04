import java.lang.*;
 public class wideningAndNarrowing {
    public static void main(String args[]) {
        byte b = 97;
        int i = 1;
        boolean bool = true;
        float f = 1f;
        long l = 1L;
        short s = 256;
        double d = 1d;
        char c = 65;

        c=(char)b;
        System.out.println(c);
    }
}
