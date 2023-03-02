package day13_String;

public class StringMethods {
    public static void main(String[] args) {

        String word="Cydeo";

        char thirdChar= word.charAt(2);

        System.out.println("thirdChar = " + thirdChar);

        double length=word.length();
        System.out.println(length);

        float length2=word.length();
        System.out.println("length2 = " + length2);

        String str="wooden spoon";
        System.out.println(str.toUpperCase());

        String upper="jksdnfşdsnşfndsşv".toUpperCase();
        System.out.println("upper = " + upper);
    }
}
