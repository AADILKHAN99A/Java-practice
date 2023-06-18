public class factorailFinder {
    public static void main(String[] args) {
        int num=20;
        int fact=1;
        for(int i =num;i>0;i--)
        {
            fact = i*fact;
        }
        System.out.println(fact);
    }
}
