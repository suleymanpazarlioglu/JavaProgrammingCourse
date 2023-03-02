package day24_CustomMethod_Return;

public class ReturnMethodIntro {

    public static String reverse(String word){
        String reverse="";

        for (int i=word.length()-1;i>=0;i--){
            reverse+=word.charAt(i);

        }
        return reverse;
    }

    public static void main(String[] args) {
        String word="Java";

        String reverseWord=reverse(word);

        System.out.println(reverseWord);
    }
}
