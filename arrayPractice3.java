public class arrayPractice3 {
    public static void main(String[] args) {
        int A[]= new int[]{8,6,10,9,2,15,7,13,14,11};
        int B[]= new int[10];
        int C[]= new int[10];

        //   Copying of array A to B

        System.out.println("Copying.....");
        for(int i =0;i<A.length;i++)
        {
            B[i]=A[i];
        }

        for(int x:B)
        {
            System.out.print(x+" ");
        }

        //  Reverse Copying A to C

        System.out.println("\nReverse Copying......");
        for(int i =A.length-1,j=0 ; i>=0 ;i--,j++)
        {
            C[j]=A[i];
        }

        for(int x:C)
        {
            System.out.print(x+" ");
        }
    }
}
