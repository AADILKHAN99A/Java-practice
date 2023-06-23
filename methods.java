public class methods {

    static int add(int a, int b)        // static method can only call static method (main is static)
    {
        int c = a+b;
        return c;
    }

    int sub(int a,int b)
    {
        int d = a-b;
        return d;
    }

    static void inc(int x)
    {
        x++;
        System.out.println("In method value of a: "+x);
    }
    public static void main(String[] args) {

        int a = 10,b=10;
        System.out.println(add(a,b));

        methods s = new methods();           // create an object 's' of class 'methods'
        System.out.println(s.sub(a,b));     //using object 's' access 'sub' method of class 'methods'

        inc(a);
        System.out.println("After increment method call value of a: "+a);     // does not effect on actual pararmeters

    }
}
