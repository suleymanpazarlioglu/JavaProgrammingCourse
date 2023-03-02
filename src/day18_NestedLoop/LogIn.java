package day18_NestedLoop;

import java.util.Scanner;

public class LogIn {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter a username: ");
        String username=scan.next();

        System.out.println("Enter a password: ");
        String password=scan.next();


        for (int i = 0; i <3 ; i++) {
            if(i==2) System.out.println("Last chance for log in");

            if (!(username.equals("Cydeo") || password.equals("WoodenSpoon"))){
                System.err.println("Invalid entry,please re-entry");

                System.out.println("Enter a username: ");
                username=scan.next();

                System.out.println("Enter a password: ");
                password=scan.next();

            }
            else{ System.out.println("You are logged in");
            break;
            }

        }

        if (!(username.equals("Cydeo") || password.equals( "WoodenSpoon"))){
            System.out.println("Account is logged");}




    }
}
