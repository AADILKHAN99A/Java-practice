import java.lang.*;
public class bitwiseOperator {
    public static void main(String args[]) {
        int x=10, y=-10,z;
        int a=0b1010;   //10
        int b=0b1101;   //13

        z=a&b;
        System.out.println("And "+z);
//        System.out.println(String.format("%s",Integer.toBinaryString(z)));

        z=a|b;
        System.out.println("Or "+z);
//        System.out.println(String.format("%s",Integer.toBinaryString(z)));

        z=a^b;
        System.out.println("Xor "+z);
//        System.out.println(String.format("%s",Integer.toBinaryString(z)));

        z=x<<2;
        System.out.println("Left Shift "+z);
//        System.out.println(String.format("%s",Integer.toBinaryString(z)));

        z=y>>1;
        System.out.println("Right Shift "+z);
//        System.out.println(String.format("%s",Integer.toBinaryString(z)));

        z=y>>>1;
        System.out.println("Unsigned Right Shift "+z);
        System.out.println(String.format("%32s",Integer.toBinaryString(z)));

        z=~x;
        System.out.println("Not "+z);
//        System.out.println(String.format("%s",Integer.toBinaryString(z)));
    }



}