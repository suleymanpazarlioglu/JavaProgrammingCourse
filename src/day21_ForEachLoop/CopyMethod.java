package day21_ForEachLoop;

import java.util.Arrays;

public class CopyMethod {
    public static void main(String[] args) {

        String[] students={"Elif","Sinem","Gunay","Cihad","David","James","Aaron","Daniel"};

        String [] earlyBirds= Arrays.copyOf(students,3);

        System.out.println(Arrays.toString(earlyBirds));

        int [] numbers={1,2,3,4,5,6,7,8,9,10};
        numbers=Arrays.copyOf(numbers,5);

        System.out.println(Arrays.toString(numbers));

        System.out.println("--------------------------------------------------");

        numbers=Arrays.copyOfRange(numbers,2,4);

        System.out.println(Arrays.toString(numbers));


    }
}
