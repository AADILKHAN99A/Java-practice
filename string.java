import java.lang.*;

public class string {
    public static void main(String arg[]) {
        char c[] = {'A', 'B', 'C', 'D'};
        String str = "Hello world";     //Obj created in only pool

        String str1 = new String(c);    //Obj created in heap
        System.out.println(str1);

        String str0 = new String(str);
        System.out.println(str0);

        byte b[] = {65, 66, 67, 68};
        String str2 = new String(b);    //Obj created in heap
        System.out.println(str2);

        String str3 = new String("Java");  //Obj created in heap and pool

        String str4 = "Hello world";   //Obj does not create in pool because it already created in line 6
        String str5 = new String("Hello world");  //obj is create in heap but not in pool because it already exist

        String str6 = new String(c, 1, 2); // 1 = starting index, 2= number of letters
        System.out.println(str6);

        System.out.println(str == str4);  // object is same
        System.out.println(str == str5);  // object does not same

    }
}
