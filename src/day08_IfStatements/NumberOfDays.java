package day08_IfStatements;
import java.util.*;
public class NumberOfDays {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Please enter number of month");
        int month=input.nextInt();

        if (month==2) System.out.println("28 days");
        if (month==4 || month==6 || month==9 || month==11) System.out.println("30 days");
        if (month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12) System.out.println("31 days");

    }
}
