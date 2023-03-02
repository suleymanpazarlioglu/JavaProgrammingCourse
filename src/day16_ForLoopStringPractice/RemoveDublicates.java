package day16_ForLoopStringPractice;

import java.util.Scanner;

public class RemoveDublicates {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("enter word");
        String word=input.nextLine();

        String result="";

        for(int i=0;i<word.length();i++){
         String ch=""+word.charAt(i);

         if (!result.contains(ch)){
             result += ch;}}

        System.out.println(result);
    }
}
