package day01_JavaIntro;


import utilities.ArraysUtility;
import utilities.StringUtility;

import java.util.Arrays;

public class testClass {
    public static void main(String[] args) {
        String str="Wooden Spoon";
        //StringUtility.printEachChar(str);
        //System.out.println(StringUtility.reverse(str));
        String str2="civic";
        System.out.println(StringUtility.isPalindrome(str2));

        String str3="aaaabdddsss";
        System.out.println(StringUtility.removeDuplicates(str3));

        int arr[]={1,2,3};
        ArraysUtility.printEach(arr);
        char [] ch=str2.toCharArray();
        ArraysUtility.printEach(ch);

        System.out.println(ArraysUtility.maxNumber(arr));

        boolean b=ArraysUtility.contains(arr,10);
        System.out.println(b);
    }
}
