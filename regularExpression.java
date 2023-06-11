public class regularExpression {
    public static void main(String[] args) {

        String str = "p";
        System.out.println(str.matches("."));  //Accept any symbol

        String str1 = "a";
        System.out.println(str1.matches("[abc]"));      //Accept only 'a', only 'b', only 'c' (single symbol)
                                                              //Case Sensitive
        String str2 = "p";
        System.out.println(str2.matches("[^abc]"));    //Accept all symbol except a,b,c  (single symbol)

        String str3 = "j1";                                     //'1j' is also not accept because first a-z then 0-9
        System.out.println(str3.matches("[a-z][0-9]"));  //Accept all symbol in range (a-z) and (0-9)
                                                               // Total combinations = 26*10 = 260

        String str4 = "a";
        System.out.println(str4.matches("[a-z0-9]"));  // Accept all symbols in only range of(a-z) or 0-9  (single symbol)

        String str5 = "b";
        System.out.println(str5.matches("a|b"));    //Accept only a or b

        String str6 = "abc";
        System.out.println(str6.matches("abc"));    //Accept only exact "abc"


        //                                 meta Characters

        String str7 = "9";
        System.out.println(str7.matches("\\d"));  //only digits   (single symbol)

        String str8 = "a";
        System.out.println(str8.matches("\\D"));  // not digits   (single symbol)

        String str9 = " ";
        System.out.println(str9.matches("\\s"));  //only spaces   (single symbol)

        String str10 = "a";
        System.out.println(str10.matches("\\S"));  //Not spaces   (single symbol)

        String str11 = "s";
        System.out.println(str11.matches("\\w"));  //alphabets or digit   (single symbol)

        String str12 = "$";
        System.out.println(str12.matches("\\W"));  //not alphabets or digit   (single symbol)


        //                         ..............Quantifiers...........

        //              *  (0 or more time)

        String s = "";
        //     s = "akdasdkfp^ksd";
        System.out.println(s.matches(".*"));

        String sa = "abcaabbccba";
        System.out.println(sa.matches("[abc]*"));

        String sb = "ajlskdfisfsdklfi";
        System.out.println(sb.matches("[a-z]*"));

        //              +  (1 or more time)

        String s1 ="q";
        System.out.println(s1.matches(".+"));

        //              ?  (0 or 1 time)

        String s2 = "";
        System.out.println(s2.matches(".?"));

        //              {X}  (X times/ characters = X)

        String s3 = "a0d7$";
        System.out.println(s3.matches(".{5}"));

        //              {X,Y}  (Min = X, Max = Y)

        String s4 ="1b";
        System.out.println(s4.matches(".{2,5}"));


        //                      Use Cases of RE

        String st = "john@gmail.com";
        System.out.println(st.matches(".*gmail.*"));   // before and after 'gmail' any symbol and any number of times are allowed

        String st1 = "j0hn@gmail.com";
        System.out.println(st1.matches("\\w*@gmail.com"));  // before '@gmail.com' only alphabets and digits are allowed




    }


}
