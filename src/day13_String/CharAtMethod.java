package day13_String;

import java.util.Scanner;

public class CharAtMethod {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("enter your firstname");
        String firstname=input.next();

        System.out.println("enter your lastname");
        String lastname=input.next();

        char f=firstname.charAt(0);
        char l=lastname.charAt(0);

        String initial=f+"."+l;

        System.out.println(initial);

        input.close();
    }
}
