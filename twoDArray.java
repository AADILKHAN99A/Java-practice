public class twoDArray {
    public static void main(String[] args) {
        int A[][]=new int[][]{{1,2,3,4},{4,5,6,7},{8,9,10,11}};

        int D[][]={{1,2,3,4},{4,5,6,7},{8,9,10,11}};

        int [][]B = new int[3][2];    //size of row is mandatory if you do not give values in declaration
                                      // and if you give only row value then you cant use it because column values is null

        int C[][];
        C = new int[4][5];

        int []E[]=new int[4][3];

        int []F,G[];        // here F is 1-D array but G is 2-D array

        int []H,I,J,K;      // All are 1-D array
        int []L,M,N,O[];    // All are 1-D array except O, O is 2-D Array



        //printing array elements using for loop
        for(int i =0;i<A.length;i++)
        {
            for (int j =0;j<A[0].length;j++)
            {
                System.out.print(A[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();


        //Printing array elements using for each loop

        for(int x[]:B)
        {
            for(int y:x)
            {
                System.out.print(y+" ");
            }
            System.out.println();
        }
        System.out.println();


        // Jagged/Rugged Array

        int Y[][];            //create an reference of array that holds reference to array
        Y=new int[3][];       //create an object of array that holds reference to array and assign to above reference
        Y[0]=new int[2];      //create an object of array that holds value with size 2 and assign to above reference [0]
        Y[1]=new int[4];      //create an object of array that holds value with size 4 and assign to above reference [1]
        Y[2]=new int[3];      //create an object of array that holds value with size 3 and assign to above reference [2]

        for(int i =0;i< Y.length;i++)
        {
            for(int j =0;j<Y[i].length;j++)
            {
                System.out.print(Y[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();


        int Z[][];
        Z=new int[3][];
        Z[0]=new int[]{1,2};
        Z[1]=new int[]{3,4,5,9};
        Z[2]=new int[]{6,7,8};

        for(int x[]:Z)
        {
            for(int y:x)
            {
                System.out.print(y+" ");
            }
            System.out.println();
        }

    }
}
