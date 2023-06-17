public class arrayPractice1 {
    public static void main(String[] args) {
        int A[]={5,9,6,10,12,73,5,4,2};
        int temp = A[0];

        for(int x:A)
        {
            System.out.print(x+" ");
        }

        for(int i = 1;i<A.length;i++)
        {
            A[i-1]=A[i];
        }
        A[A.length-1]=temp;


        System.out.println("\n\nLeft Rotation");
        for(int x:A)
        {
            System.out.print(x+" ");
        }

        temp = A[A.length-1];
        for(int i = A.length-1;i>=1;i--)
        {
            A[i]=A[i-1];
        }
        A[0]=temp;

        System.out.println("\n\nRight Rotation");
        for(int x:A)
        {
            System.out.print(x+" ");
        }

    }
}
