import java.lang.*;
import java.util.*;

class quaderaticEquation {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        float a, b, c;
        a = sc.nextFloat();
        b = sc.nextFloat();
        c = sc.nextFloat();
        double dis = Math.sqrt((b * b) - (4 * a * c));
        double r1 = (-b + dis) / (2 * a);
        double r2 = (-b - dis) / (2 * a);

        System.out.println("Roots are" + r1 + " " + r2);
    }
}