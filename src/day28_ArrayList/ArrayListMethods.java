package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListMethods {
    public static void main(String[] args) {

        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(10);
        System.out.println(numbers);
        numbers.add(20);
        System.out.println(numbers);
        numbers.add(30);
        System.out.println(numbers);
        numbers.add(40);
        System.out.println(numbers);
        numbers.add(50);
        System.out.println(numbers);
        numbers.add(60);
        System.out.println(numbers);

        numbers.add(2,25);
        System.out.println(numbers);

        System.out.println(numbers.get(3));





    }
}
