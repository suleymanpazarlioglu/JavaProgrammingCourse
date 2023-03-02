package day18_NestedLoop;

import java.util.Scanner;

public class NestedloopPractice {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        while(true) {
            System.out.println("Enter your age: ");
            int age = scan.nextInt();

            while (!(age >= 1 && age <= 120)) {
                System.out.println("Invalid entry,please re-enter: ");
                age = scan.nextInt();
            }


            System.out.println("would you like to continue?");
            String a=scan.next();

            while(!(a.equalsIgnoreCase("yes")||a.equalsIgnoreCase("no"))){
                System.out.println("Invalid entry,please re-entry.Would you like to continue?");
                a=scan.next();
            }

            if (a.equalsIgnoreCase("no")){
                break;
            }
        }
    }
}
