package day08_IfStatements;
import java.util.Scanner;
public class GradeReport {
    public static void main(String[] args) {
        Scanner konsolVeri = new Scanner(System.in);

        System.out.print("enter the score:");
        int score=konsolVeri.nextInt();

        if (score>=90) System.out.println("Excellent");
        if (score>=80 && score<90) System.out.println("Great");
        if (score>=70 && score<80) System.out.println("Good");
        if (score>=60 && score<70) System.out.println("Passed");
        if (score<60) System.out.println("Failed");
    }
}
