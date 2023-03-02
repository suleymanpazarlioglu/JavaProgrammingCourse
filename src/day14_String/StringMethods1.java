package day14_String;

public class StringMethods1 {
    public static void main(String[] args) {
        String str1="      batch 09     ";
        String str2=str1.trim();
        str1.trim();
        System.out.println(str1);
        System.out.println(str2);

        String str3="Java Programming language";
        int a=str3.indexOf("a");

        System.out.println(a);

        String str4=str3;

        int b=str4.lastIndexOf('a');

        System.out.println(b);


    }
}
