public class methodObjectPassing {

    static void update(int A[])             // reference A is created for update mehtod
                                            // and holds the address of 'main' method array object
    {
        A[0]=100;
    }

    public static void main(String[] args) {
        int A[]={2,3,4,5,6};
        System.out.println("Before Passing :");
        for(int x:A)
        {
            System.out.print(x+" ");
        }

        update(A);                          // Passing the object of Array A

        System.out.println("\nAfter Passing: ");
        for(int x:A)
        {
            System.out.print(x+" ");
        }

    }
}
