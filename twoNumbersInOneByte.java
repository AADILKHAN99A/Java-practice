public class twoNumbersInOneByte {
    public static void main(String args[]) {
        byte x = 9, y = 12, c;
        y =(byte)(y<<4);
        c = (byte) (x | y);

        System.out.println("left side value is "+((c&0b11110000)>>4));
        System.out.println("Right Side value is"+((c&0b00001111)));

    }
}
