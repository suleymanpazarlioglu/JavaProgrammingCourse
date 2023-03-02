package day16_ForLoopStringPractice;

public class DigitsLettersSpecialChar {
    public static void main(String[] args) {
        String str="271y218hjbsda822^^+)+=')dksbc3^^ fe8mf";

        String letter="";
        String digit="";
        String specialChar="";

        for (int i=0;i<str.length();i++){
            if(str.charAt(i)<='9' && str.charAt(i)>='0')
                digit+=str.charAt(i);
            else if ((str.charAt(i)<='Z'&&str.charAt(i)>='A')||(str.charAt(i)<='z'&&str.charAt(i)>='a'))
                letter+=str.charAt(i);
            else specialChar+=str.charAt(i);

        }
        System.out.println("digit = " + digit);
        System.out.println("letter = " + letter);
        System.out.println("specialChar = " + specialChar);
    }
}
