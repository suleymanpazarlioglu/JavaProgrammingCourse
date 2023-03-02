package day22_MultiDimensionalArray;

import java.util.Arrays;

public class ForEachLoop {
    public static void main(String[] args) {
        int [][] array={{1,2,3},{4,5,6,7},{8,9,10,11,12}};

        for (int[] each:array){
            System.out.println(Arrays.toString(each));
        }

        for (int []each:array){
            for (int eachelement:each)
            System.out.println(eachelement);
        }



    }
}
