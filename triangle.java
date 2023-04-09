import java.lang.*;
import java.util.*;
import java.math.*;

public class triangle {

    public static void main(String args[]) {
        float base, height, area;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base and height of Triangle");
        base = sc.nextFloat();
        height = sc.nextFloat();

        area = (base * height) / 2;

        System.out.println("Area of Triangle is : " + area);

        float a, b, c, s, r;
        double result;
        System.out.println("Enter Values of side a, b, c");
        a = sc.nextFloat();
        b = sc.nextFloat();
        c = sc.nextFloat();

        s = (a + b + c) / 2;
        r = s * ((s - a) * (s - b) * (s - c));
        result = Math.sqrt(r);
        System.out.println(result);

    }
}
