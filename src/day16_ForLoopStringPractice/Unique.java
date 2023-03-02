package day16_ForLoopStringPractice;

public class Unique {
    public static void main(String[] args) {
        String input="aaaabaaacccck";

        String result="";

        for(int i=0;i<input.length();i++){
            if(input.indexOf(input.charAt(i))==input.lastIndexOf(input.charAt(i)))
                result+=input.charAt(i);

        }

        System.out.println(result);
    }
}
