import java.util.Scanner;

public class patterns {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

//              Pattern 1
        System.out.println("Pattern 1");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println("\n");

//              Pattern 2
        System.out.println("Pattern 2");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
        System.out.println("\n");

//              Pattern 3
        System.out.println("Pattern 3");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(i + j);
            }
            System.out.println();
        }
        System.out.println("\n");

//              Pattern 4
        System.out.println("Pattern 4");
        int count = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.printf("%02d ", count);
                count++;
            }
            System.out.println();
        }
        System.out.println("\n");


//              Pattern 5
        System.out.println("Pattern 5");

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");

            }
            System.out.println();
        }
        System.out.println("\n");

//              Pattern 6
        System.out.println("Pattern 6");
        count = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
        System.out.println("\n");

//              Pattern 7
        System.out.println("Pattern 7");

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j + " ");

            }
            System.out.println();
        }
        System.out.println("\n");

//              Pattern 8
        System.out.println("Pattern 8");

        for (int i = 1; i <= n; i++) {
//            int space = i-1;
//            for(; space>0;space--)
//            {
//                System.out.print(" ");
//            }

            for (int j = 1; j <= n; j++)  //if you use upper code for printing space then use j<=n-i+1
            {
                if (j >= i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
        System.out.println("\n");

//              Pattern 9
        System.out.println("Pattern 9");

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j < n - i + 1) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }

            }
            System.out.println();
        }
        System.out.println("\n");

//              Pattern 10
        System.out.println("Pattern 10");

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j < n - i + 1) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }

            for (int k = 1; k < n; k++) {
                if (k <= i - 1) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        System.out.println("\n");

//              Pattern 11
        System.out.println("Pattern 11");

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j < n - i + 1) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }

            for (int k = 1; k < n; k++) {
                if (k <= i - 1) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        //  bottom triangle
        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j <= i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }

            for (int k = 1; k < n; k++) {
                if (k <= n - i - 1) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }


    }
}