package day21_ForEachLoop;

import java.util.Arrays;

public class UniqueElement {
    public static void main(String[] args) {
        String[] words={"Java","Java","C#","JavaScript","Python","Python"};
        String result="";
        char[] Array=words[0].toCharArray();
        System.out.println(Arrays.toString(Array));
        for(String each:words){
            int count=0;
            for (int i = 0; i < words.length; i++) {
                if(each.equals(words[i]))
                    count++;
            }
            if (count==1) {
                result += each;
                result+=" ";
            }
        }
        System.out.println("unique elements: "+result);
    }
}
