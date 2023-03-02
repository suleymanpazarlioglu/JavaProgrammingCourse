package day52_Map_FunctionalInterface;

import java.util.Arrays;

public class Test2 {
    public static void main(String[] args) {

        MySecondFunctionalInterface<String> printEach= (str)->{
            String [] characters=str.split("");
            System.out.println(Arrays.asList(characters));
        };

        printEach.test("Süleyman");

        MySecondFunctionalInterface<Integer> cube= (number)->{
            System.out.println(number*number*number);
        };

        cube.test(3);

    }
}
