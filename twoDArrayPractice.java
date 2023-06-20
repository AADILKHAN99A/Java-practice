public class twoDArrayPractice {
    public static void main(String[] args) {
        int A[][] = new int[][]{{3, 5, 9}, {7, 6, 2}, {4, 3, 5}};

        int B[][] = new int[][]{{1, 5, 2}, {6, 8, 4}, {3, 9, 7}};

        int C[][] = new int[B.length][B[0].length];

        // Addition of two Matrices
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }

        System.out.println("Addition");
        for (int x[] : C) {
            for (int y : x) {
                System.out.print(y + " ");
            }
            System.out.println();
        }
        System.out.println();

        // Multiplication of two matrices

        if (A[0].length == B.length) {
            int D[][] = new int[A.length][B[0].length];

            for (int i = 0; i < A.length; i++) {
                for (int j = 0; j < A[0].length; j++) {
                    for (int k = 0; k < D[0].length; k++) {
                        D[i][j] = A[i][k] * B[k][j] + D[i][j];
                    }
                }
            }

            System.out.println("Multiplication");
            for (int x[] : D) {
                for (int y : x) {
                    System.out.print(y + " ");
                }
                System.out.println();
            }
            System.out.println();
        } else
            System.out.println("Matrices does not multiply because row and columns are not same");


        // Sorting Array with Objects of Strings based on names

        String str[] = {"java","python","pascal","smalltalk","ada","basic"};

        java.util.Arrays.sort(str);
        for(String x:str)
        {
            System.out.print(x+" ");
        }

    }

}
