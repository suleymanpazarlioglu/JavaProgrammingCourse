package day09_IfStatements;
import java.util.*;
public class numberOfDay {
    public static void main(String[] args) {

        Scanner konsolVeri = new Scanner(System.in);

        System.out.print("enter the number of day:");
        int day = konsolVeri.nextInt();

        String[] week = new String[]{"monday", "tuesday", "wednesday", "thursday", "friday", "saturday", "sunday"};

        for (int i = 1; i <= 7; i++) {
            if (i == day) {
                System.out.println(week[i - 1]);
                break;
            }
        }
    }
}
