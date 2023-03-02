package day16_ForLoopStringPractice;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter String");
        String word=input.nextLine();
        String reverse="";
        int WordLength=word.length();

        for(int i=WordLength-1;i>=0;i--)
            reverse+=word.charAt(i);

        if (word.equalsIgnoreCase(reverse))
            System.out.println("Palindrome");
        else System.err.println("it is not a Palindrome");



    }
}
