package utilities;

import java.util.Arrays;

public class StringUtility {
    //prints each character of the given String
    public static void printEachChar(String str){
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
    }

   //return reversed the given String
    public static String reverse(String str){
        String result="";

        for (int i = str.length()-1; i >=0 ; i--) {
            result+=str.charAt(i);
        }
        return result;
    }

    //check if the given String is palindrome,returns boolean
    public static boolean isPalindrome(String str){
        if(reverse(str).equalsIgnoreCase(str))
            return true;
        else
            return false;
    }


    //checks if the given string is anagram,returns boolean
    public static boolean anagram(String str1,String str2){
        char arr1[]=str1.toCharArray();
        char arr2[]=str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1,arr2);

    }

    //removes the duplicates from  given string,returns string
    public static String removeDuplicates(String str){
        String result="";
        for (int i = 0; i <str.length() ; i++) {
            if(result.contains(""+str.charAt(i))){
                continue;
        }
            else result+=str.charAt(i);
        }
        return result;
    }



}
