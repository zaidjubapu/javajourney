package com.company;

import java.util.Locale;

public class cwh_07_stringmethods {
    public static void main(String[] args){
        String name = "harry";
        int l=name.length();
        String lower=name.toLowerCase();
        String upc=name.toUpperCase();
        String nontrimmedstring= "   harry    ";
        String ts = nontrimmedstring.trim();
        String substring = name.substring(1);
        String substring1 = name.substring(1,5); // cannot give the index out of bound
        System.out.println(substring1);
        String replace = name.replace('a','b'); // replace all the character
        String replace1 = name.replace("r", "zaid");
        boolean startswith = name.startsWith("ha");
        boolean endswith = name.endsWith("ry");
        System.out.println(endswith);
        char charat = name.charAt(3);// willreturn the r
        int indexof  = name.indexOf("ar"); // will return the index of a ,here searching start from start
        int indexof1 = name.indexOf("ry",2); // here it will search from index2 to index end
        int lastindex=name.lastIndexOf("r"); // will return the last occurance of a; here searchingstart from end
        int lastindex1=name.lastIndexOf("r",3); // here it will search from index 3 to index 0
        boolean a= name.equals("harry");// if the string is same it will return true
        boolean b=name.equalsIgnoreCase("HArry");  //will return true if the string same by ignoring the case
        System.out.println("iam escape se' characte \" double quotes");
        System.out.println("iam single backslash \\"); // will print single back slash

    }
}
