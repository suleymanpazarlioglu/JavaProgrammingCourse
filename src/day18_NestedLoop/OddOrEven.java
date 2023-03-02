package day18_NestedLoop;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        while(true){
        System.out.println("please enter a number:");
        int number= scan.nextInt();


            if(number%2==0){
                System.out.println("even number");
            }
            else {
                System.out.println("odd number");
            }

                System.out.println("would you like to enter another number:");
                String answer=scan.next();

                while(!(answer.equalsIgnoreCase("yes")||answer.equalsIgnoreCase("no"))){
                    System.out.println("Invalid entry,please re-enter.would you like to enter another number");
                    answer=scan.next();
                }
                if (answer.equalsIgnoreCase("no")){
                    break;
                }
            }
        }
    }

