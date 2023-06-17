public class arrayPractice {
    public static void main(String[] args) {
        int A[]=new int[]{1,2,3,1,7,8,11};

        //              Sum of All elements in array
        int sum = 0;
        for (int x:A)
        {
            sum = sum+x;
        }
        System.out.println("sum of all elements in array : "+sum);

        //      Finding maximum element
        int max = A[0];
        for(int x:A)
        {
            if(x>max)
            {
                max = x;
            }

        }
        System.out.println("Maximum element of Array : "+max);

        //          Finding Second largest Element
        max = A[0];
        int secMax = A[0];
        for(int x:A)
        {
            if(x>max)
            {
                secMax=max;
                max= x;
            }
//            else if(x>secMax)
//            {
//                secMax=x;
//            }
        }
        System.out.println("Second largest number is :"+secMax);

        //              Finding an element in Array

        int number = 3;
        int count = 0;
        for(int x:A)
        {
            if(x==number)
            {
                System.out.println("Number is found at index:"+count);
                System.exit(0);
            }
            count++;

        }
        System.out.println("number is not found");


    }
}
