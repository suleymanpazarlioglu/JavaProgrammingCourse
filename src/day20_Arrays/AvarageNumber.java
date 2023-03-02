package day20_Arrays;

import java.util.Scanner;

public class AvarageNumber {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number of array");
        int length = input.nextInt();

        int result = 0;
        int[] array = new int[length];

        for (int i = 0; i < array.length; i++) {
            System.out.println("enter a number");
            array[i] = input.nextInt();
        }

        for (int i = 0; i < array.length; i++) {
            result+=array[i];

        }

        System.out.println("Avarage number: "+result/ array.length);
    }
}
