package day13_String;

import java.util.Locale;

public class StringIntro {
    public static void main(String[] args) {

        String str1=new String("java");
        String str2=new String("java");

        System.out.println(str1==str2);
        System.out.println(str1.length()==str2.length());
        System.out.println(str1.charAt(0)==str2.charAt(0));
        System.out.println(str1.toUpperCase());
        System.out.println("str1 = " + str1);
        System.out.println(str1.startsWith("k"));
        System.out.println(str1.equals(str2));



    }
}
