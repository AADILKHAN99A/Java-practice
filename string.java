import java.lang.*;

public class string {
    public static void main(String arg[]) {
        char c[] = {'A', 'B', 'C', 'D'};
        String str = "Hello world";     //Obj created in only pool

        String str1 = new String(c);    //Obj created in heap
        System.out.println(str1);

        byte b[] = {65, 66, 67, 68};
        String str2 = new String(b);    //Obj created in heap
        System.out.println(str2);

        String str3 = new String("Java");  //Obj created in heap and pool

        String str4 = "Hello world";   //Obj does not create in pool because it already created in line 6
        String str5 = new String("Hello world");  //obj is create in heap but not in pool because it already exist


    }
}
