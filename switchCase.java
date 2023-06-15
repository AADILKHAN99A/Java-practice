
import java.util.*;

public class switchCase {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {     // endless loop until not type exit
            System.out.println("open\nnew\nsave\nsave as\nclose\nexit");
            String choice = scan.next();

            switch (choice) {
                case "open":
                    System.out.println("file opened");
                    break;

                case "new":
                    System.out.println("new file created");
                    break;

                case "save":
                    System.out.println("file saved");
                    break;

                case "save as":
                    System.out.println("file saved as ");
                    break;

                case "close":
                    System.out.println("file closed");
                    break;

                case "exit":
                    System.out.println("exiting......");
                    break;

                default:
                    System.out.println("wrong input");
                    break;
                            }
                            if(choice.equals("exit"))   // to exit from endless while loop
                            {
                                break;
                            }
                    }
    }
}
