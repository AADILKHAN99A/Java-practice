import java.lang.*;

public class printingMethod {
    public static void main(String args[]) {
        int x = 10, y = 20, p = -10;
        float z = 125.65f;
        String str = "Hello world";
        System.out.println("Sum" + x + y);

        System.out.println("Sum" + (x + y));

        System.out.println(x + y + "Sum");

        System.out.println(x + "sum" + y);

        System.out.println("Sum" + x + "Sum" + y);

        System.out.println("Sum" + "Sum");

        System.out.println(x + y + x + y);

        System.out.println(x + y + "Sum" + x + y);

        System.out.println(x + "" + y + "" + "Sum");

        System.out.println("..................Printf Method...............");

        //     printf("format_specifier",variable)
        //     %[arguments_index$][flag][width][.precision]conversion

        System.out.printf("Java \n");

        System.out.printf("Java %d \n", x);   //decimal

        System.out.printf("Java %o \n", x);  //octal

        System.out.printf("Java  %1$d %2$d \n", x, y);  //arguments with index

        System.out.printf("Java  %1$d %2$d \n", y, x);

        System.out.printf("Java  %2$d %1$d \n", x, y);

        System.out.printf("%e \n", z);  //Scientific Representation

        System.out.printf("Java %s \n", str);

        System.out.printf("%5d \n", p);      //width is 5 and flag is space/blank

        System.out.printf("%05d \n", p);     //width is 5 and flag is 0

        System.out.printf("%(5d \n", p);     //width is 5 and flag is (  "if number is -ve it print in ()"

        System.out.printf("%(5d \n", x);

        System.out.printf("%-5d \n", p);     //value will be same but also left alligned

        System.out.printf("%f \n", z);

        System.out.printf("%1$05.2f \n", z);  //arg_index = 1, flag = 0, width = 5, precision = .2

        float f = 86256.2295f;

        System.out.printf("%1$05.2f \n", f);

        System.out.printf("%1$9.2f \n", f);

        System.out.printf("%1$09.2f \n", f);

        System.out.printf("%20s \n", str);

        System.out.printf("%-20s \n", str);


    }
}