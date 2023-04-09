import java.lang.*;
import java.util.*;

class cuboid {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        float length, breadth, height, area, volume;
        length = sc.nextFloat();
        breadth = sc.nextFloat();
        height = sc.nextFloat();

        volume = length * height * breadth;
        area = 2 * (length * height + length * breadth + height * breadth);

        System.out.println("volume :" + volume + " MeterCube " + "Area :" + area + " Metersquare");


    }


}
