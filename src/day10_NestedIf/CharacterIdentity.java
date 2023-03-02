package day10_NestedIf;

public class CharacterIdentity {
    public static void main(String[] args) {
        char ch='8';

        if(ch>='0' && ch<='9') System.out.println("digit");
        else if ((ch>='A'&&ch<='Z') || (ch>='a'&&ch<='z')) System.out.println("alphabetic");
        else System.out.println("special character");


    }
}
