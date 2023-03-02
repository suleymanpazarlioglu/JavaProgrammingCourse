package day17_While_DoWhile;

import java.util.Scanner;

public class EligibleToVote {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age=scan.nextInt();

        while (!(age<=120 && age >= 1)){
            System.err.println("Invalid age, please re-enter");
            age = scan.nextInt();
        }

        System.out.println("Are you a US citizen? yes/no");
        String answer=scan.next();

        while (!(answer.equalsIgnoreCase("yes")|| answer.equalsIgnoreCase("no"))){
            System.err.println("Invalid entry, please re-enter: ");
            answer= scan.next();
        }

        if (age>=18&&answer.equalsIgnoreCase("yes"))
            System.out.println("you are eligible to vote");
        else System.err.println("you are not eligible to vote");




    }
}
