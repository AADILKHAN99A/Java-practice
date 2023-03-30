import java.lang.*;

public class createobj {
    public static void main(String args[]) {
        int x = 1, y = 2, z;
        z = x + y;
//create obj of string class use it as referance
        String st = new String("Sum is ");
        System.out.println(st + z);

        // Create obj of class Integer and use as referance
        Integer k = new Integer(5);
        Integer l = new Integer(4);
        Integer m = new Integer(k + l);
        System.out.println(m);

    }
}

