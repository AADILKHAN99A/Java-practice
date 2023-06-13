
public class stringPractice {
    public static void main(String[] args) {

        String str= "adkf#$%% dskl    sdkfjl    (* kl";
        String str2 = "     adkf#$%% dskl    sdkfjl    (* kl   ";

        str =str.replaceAll("[^0-9a-zA-Z]","");   // ("regex","Replacement")
        System.out.println(str);

        str2 =str2.replaceAll("\\s+"," ").trim();
        System.out.println(str2);

        String words[]= str2.split("\\s");      //it split the sentence bases of spaces(RE) and give array of string
        System.out.println("Total words are: "+words.length);



        //     or you can write your code for such tasks


//        String str1,newstring="";
//        for(int i = 0;i<str.length();i++)           //traverse string
//        {
//
//           str1=String.valueOf(str.charAt(i));      //store ith index char in str1
//
//           boolean check = str1.matches("\\w+|\\s");   //compare with only alphabets and digits regex
//
//           if(check)
//           {
//            newstring=newstring.concat(str1);           //store concatenation of str1 and new string into new string
//           }
//
//        }
//        System.out.println(newstring);




    }
}