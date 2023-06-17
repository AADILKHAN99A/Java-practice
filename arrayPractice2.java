public class arrayPractice2 {
    public static void main(String[] args) {
        int A[] = new int[10];
        A[0] = 5;
        A[1] = 9;
        A[2] = 6;
        A[3] = 10;
        A[4] = 12;
        A[5] = 7;

        for (int x : A) {
            System.out.print(x + " ");
        }

        //    Inserting Element in Array  (right shift)
        int number = 1;
        int index = 3;

        if (index > (A.length - 1)) {
            System.out.println("Index Value is not in range of array");

        }
        else {
            for (int i = A.length - 1; i > index; i--) {
                A[i] = A[i - 1];
            }
            A[index] = number;

            System.out.printf("\n%d is Inserted at Index %d\n", number, index);
            for (int x : A) {
                System.out.print(x + " ");
            }
                }


        //    Deleting Element from Array  (left shift)

        int temp =A[index];
        if (index > (A.length - 1)) {
            System.out.println("Index Value is not in range of array");

        }
        else {
            for (int i =index; i < A.length-1; i++) {
                A[i] = A[i + 1];
            }


            System.out.printf("\n%d is Deleted from Index %d\n", temp, index);
            for (int x : A) {
                System.out.print(x + " ");
            }
        }


    }
}
