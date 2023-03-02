package day12_Scanner;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("name:");
        String name=input.nextLine();
        System.out.println("number 1:");
        int num1=input.nextInt();
        System.out.println("number 2:");
        int num2=input.nextInt();
        System.out.println("enter the method:");
        char method=input.next().charAt(0);
        int result=0;

        if (method=='+')result=num1+num2;
        else if (method=='-') result=num1-num2;
        else if (method=='*') result=num1*num2;
        else if (method=='/') result=num1/num2;
        else System.out.println("invalid method");
        System.out.println("name = " + name);
        System.out.println(result);
        input.close();



    }
}
