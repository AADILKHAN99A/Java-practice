public class array {
    public static void main(String[] args) {
        int A[] = new int[5];
        int B[] = {1,2,0,4,5};

        int C[];                //Reference is created
        C = new int[5];         //Object is created and assign to above Reference

        int []D = new int[5];

        B[2] = 15;

        //     For each loop

        System.out.println("Before Modification");
        for(int x:B)            // every element value in B is stored in x one by one in forward direction
        {
            System.out.println(x);
        }

        //   modified the elements of array

        for(int i =0;i<B.length;i++)
        {
            B[i]++;
        }

        System.out.println("After Modification");
        for(int x:B)
        {
            System.out.println(x);
        }

        System.out.println(B);
    }
}
