package com.company;

public class cwh_08_ps {
    public static void main(String[] args) {
        // convert string to a lower case
        /*String a = "hELlo";
        System.out.println(a.toLowerCase());*/

        // replace spaces with under score
        /*String b = " helo zaid  a";
        System.out.println(b.replace(" ", "_"));*/

        /*String letter = "Dear <| name |>, Thanks a lot";
        System.out.println(letter.replace("name", "zaid"));*/

        // detect double and triple spaces
        String str= "hello ho  w are   you ";
        System.out.println(str.indexOf("  "));
        System.out.println(str.indexOf("   "));


    }
}
