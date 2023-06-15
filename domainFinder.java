public class domainFinder {
    public static void main(String[] args) {
        String str = "ftp://www.google.gov";

        if(str.matches("https.*"))
        {
            System.out.println("Hyper Text Transfer Protocol");

            if(str.matches(".*.com"))
            {
                System.out.println("Commercial");
            }
            else if (str.matches(".*.org")) {
                System.out.println("Organization");
            }
            else if (str.matches(".*.net")) {
                System.out.println("Network");
            } else if (str.matches(".*.gov")) {
                System.out.println("Government");
            }

        }
        else if(str.matches("ftp.*"))
        {
            System.out.println("File Transfer Protocol");
            if(str.matches(".*.com"))
            {
                System.out.println("Commercial");
            } else if (str.matches(".*.org")) {
                System.out.println("Organization");
            }
            else if (str.matches(".*.net")) {
                System.out.println("Network");
            }
            else if (str.matches(".*.gov")) {
                System.out.println("Government");
            }
        }

    }
}
