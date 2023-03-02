package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter a number between 1 to 7");
        byte number=input.nextByte();

        String result="";//temporary

        if(number>=1&&number<=7){

            result=(number==1)?"monday":(number==2)?"tuesday":(number==3)?"wednesday":(number==4)?"thursday":(number==5)?"friday":(number==6)?"saturday":"sunday";

        }
        else result="invalid number";

        System.out.println(result);
        input.close();


    }
}
