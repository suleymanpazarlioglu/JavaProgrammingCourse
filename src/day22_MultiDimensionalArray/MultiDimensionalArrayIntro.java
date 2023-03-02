package day22_MultiDimensionalArray;

import java.util.Arrays;

public class MultiDimensionalArrayIntro {
    public static void main(String[] args) {

        String[] group1={"jon","joes","james"};
        String[] group2={"jon","joes","james"};
        String[] group3={"jon","joes","james"};


        String[][] groups=new String[3][];
        groups[0]=group1;
        groups[1]=group2;
        groups[2]=group3;

        System.out.println(Arrays.deepToString(groups));

        System.out.println("------------------------------------------------");

        int [][] dizi={{1,2,3},{4,5,6,7},{8,9,10,11,12}};

        System.out.println(Arrays.toString(dizi[1]));

        System.out.println(dizi[2][3]);












    }
}
