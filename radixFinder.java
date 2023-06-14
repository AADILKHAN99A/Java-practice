public class radixFinder {
    public static void main(String[] args) {
        String str="99";
        if(str.matches("[01]+"))
        {
            System.out.println("Base is 2");
        }
        else if(str.matches("[0-7]+"))
        {
            System.out.println("Base is 8");
        }
        else if (str.matches("[0-9A-F]+")) {
            System.out.println("Base is 16");
        }
        else if (str.matches("[0-9]+")){
            System.out.println("Base is 10");
        }
    }
}
