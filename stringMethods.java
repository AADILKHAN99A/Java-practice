

public class stringMethods {
    public static void main(String args[]) {
        String str = "JAVA";
        System.out.println(str.length());

        System.out.println(str.toLowerCase());
        System.out.println(str);
        String str1 = new String(str.toLowerCase()); // create a new object in heap

        String str2 = str.toLowerCase(); // Create a new object in heap
        str = str.toLowerCase(); // create a new object in heap and str point to new created object
        System.out.println(str);

        String str3 = "   Mr. Aadil Khan   ";
        str3 = str3.trim();
        System.out.println(str3);

        String sub = str3.substring(3, 9); // 3= beginIndex , 9 = endingIndex(9-1) "if you give a single argument then
                                           // it is take it as a beginIndex"
        System.out.println(sub);

        String rep = str3.replace('r', 's');
        System.out.println(rep);

        System.out.println(str3.startsWith("mr.")); // Check that Str3 is start with "mr." or not
        System.out.println(str3.startsWith("Mr."));
        System.out.println(str3.endsWith("ha")); // Check that str3 is end with "ha" or not
        System.out.println(str3.endsWith("an"));

        System.out.println(str3.charAt(6)); // return character at the index of 6

        System.out.println(str3.indexOf("Aadil")); // return index number of the string "Aadil"

        System.out.println(str3.indexOf("a", 7)); // search "a" from starting index = 7 (L->R)

        System.out.println(str3.lastIndexOf("Khan")); // search for string "Khan" from last index (R->L)

        // print whole string using loop

        for (int i = 0; i < str3.length(); i++) {
            System.out.print(str3.charAt(i) + " ");
            if (i == (str3.length() - 1)) {
                System.out.println();
            }

        }

        String str4 = "Mr. Aadil Khan";
        System.out.println(str4 == str3); // because in str3 object is changed from initial to trimmed

        System.out.println(str3.equals(str4));  // it checks that string str3 is match with str4 or not (not check that object is also same or not)
        // case sensitive

        String str5 = "MR. AADIL KHAN";
        System.out.println(str4.equalsIgnoreCase(str5));  // same as above method but case Insensitive
        String st= "python";
        String st1= "java";
        System.out.println(st.compareTo(st1));  // st > st1 so return =1 but 'p' is 6 times greater than 'j' (ASCII)
                                                // if st< st1, return = -1   if st = st1, return = 0

        String s = "china wall";
        String s1 = "china tall";
        System.out.println(s.compareTo(s1)); // china is same but 'w' is 3 times greater than 't'

        System.out.println(s.contains("wall"));  // check that "wall" is present in string or not

        System.out.println(s.concat(s1));  // concatenate strings s and s1
        int x = 65;
        String stt = String.valueOf(x);  // convert any type of data into string
        System.out.println(stt);
    }
}
