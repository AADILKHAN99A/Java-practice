import java.lang.*;

public class swappingWithoutThirdVariable {
    public static void main(String args[]) {
        int a = 9, b = 12;
        System.out.println("Before Swapping: "+a+" "+b);
        a = a ^ b;  //a=5
        b = a ^ b;  //b=9
        a = a ^ b;  //a=12
        System.out.println("After Swapping: "+a + " " + b);


    }


}
