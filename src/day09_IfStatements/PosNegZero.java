package day09_IfStatements;
import java.util.*;
public class PosNegZero {
    public static void main(String[] args) {

        Scanner KonsolVeri=new Scanner(System.in);

        System.out.println("Please enter a number");
        int number=KonsolVeri.nextInt();

        if (number>0) System.out.println("pozitive");
        else if (number<0) System.out.println("negative");
        else System.out.println("zero");
    }
}
