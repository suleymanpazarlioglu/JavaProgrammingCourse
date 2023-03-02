package day17_While_DoWhile;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("Enter your first number");
        int number1=scan.nextInt();

        System.out.println("Enter your second number");
        int number2=scan.nextInt();

        System.out.println("Enter a math operator");
        char ch=scan.next().charAt(0);

        while (!(ch== '+' || ch == '-')){
            System.out.println("Invalid Operator,Please Re-enter");
            ch=scan.next().charAt(0);
        }

        System.out.println((ch== '+')? number1+number2 : number1-number2);





    }
}
