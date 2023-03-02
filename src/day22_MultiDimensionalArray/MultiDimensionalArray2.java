package day22_MultiDimensionalArray;

import java.util.Arrays;

public class MultiDimensionalArray2 {
    public static void main(String[] args) {
        int [][][] Array3D={   {{1,2,3},{4,5,6,7},{8,9,10,11,12}}    ,   {{10,20,30},{40,50,60,70},{80,90,100,110,120}}  };
                     //             0       1             2                     0           1               2
                        //                        0                                               1

        System.out.println(Arrays.deepToString(Array3D));
        System.out.println("------------------------");
        System.out.println(Arrays.deepToString(Array3D[0]));
        System.out.println(Arrays.deepToString(Array3D[1]));

        System.out.println("-----------------------");

        System.out.println(Arrays.toString(Array3D[0][0]));
        System.out.println(Arrays.toString(Array3D[0][1]));
        System.out.println(Arrays.toString(Array3D[0][2]));
        System.out.println(Arrays.toString(Array3D[1][0]));
        System.out.println(Arrays.toString(Array3D[1][1]));
        System.out.println(Arrays.toString(Array3D[1][2]));




    }
}
