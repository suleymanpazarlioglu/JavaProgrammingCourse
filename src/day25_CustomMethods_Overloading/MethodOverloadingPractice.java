package day25_CustomMethods_Overloading;

import java.util.Arrays;

public class MethodOverloadingPractice {
    public static int[] merge(int[]array1,int[]array2){
        int[] result=new int[array1.length+array2.length];
        int i=0;
        for (int each:array1){
            result[i]=each;
            i++;
        }
        for (int each:array2){
            result[i]=each;
            i++;
        }
        return result;
    }
    public static double[] merge(double[]array1,double[]array2){
        double[] result=new double[array1.length+array2.length];
        int i=0;
        for (double each:array1){
            result[i]=each;
            i++;
        }
        for (double each:array2){
            result[i]=each;
            i++;
        }
        return result;
    }
    public static String[] merge(String[]array1,String[]array2){
        String[] result=new String[array1.length+array2.length];
        int i=0;
        for (String each:array1){
            result[i]=each;
            i++;
        }
        for (String each:array2){
            result[i]=each;
            i++;
        }
        return result;
    }
    public static char[] merge(char[]array1,char[]array2){
        char[] result=new char[array1.length+array2.length];
        int i=0;
        for (char each:array1){
            result[i]=each;
            i++;
        }
        for (char each:array2){
            result[i]=each;
            i++;
        }
        return result;
    }

    
    
    public static void main(String[] args) {
        int array1[]={1,2,3};
        int array2[]={4,5};

        char array3[]={'a','b','c'};
        char array4[]={'d','e'};

        System.out.println(Arrays.toString(merge(array1,array2)));
        System.out.println(Arrays.toString(merge(array3,array4)));
    }



}
