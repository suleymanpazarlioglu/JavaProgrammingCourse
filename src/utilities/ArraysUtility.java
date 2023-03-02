package utilities;

import java.util.Arrays;

public class ArraysUtility {
    //prints each integer of an array in separate lines
    public static void printEach(int[]array){
        int i=0;
        for (int each : array) {
            System.out.println(array[i]);
            i++;
        }
    }
    //prints each double of an array in separate lines
    public static void printEach(double[]array) {
        int i = 0;
        for (double each : array) {
            System.out.println(array[i]);
            i++;
        }
    }

    //prints each char of an array in separate lines
    public static void printEach(char[]array) {
        int i = 0;
        for (char each : array) {
            System.out.println(array[i]);
            i++;
        }
    }

    //prints each String of an array in separate lines
    public static void printEach(String[]array) {
        int i = 0;
        for (String each : array) {
            System.out.println(array[i]);
            i++;
        }
    }
    
    //returns the max number of integer array
    public static int maxNumber(int[]array) {
        Arrays.sort(array);
        return array[array.length - 1];
    }

    //returns the max number of double array
    public static double maxNumber(double[]array) {
        Arrays.sort(array);
        return array[array.length - 1];
    }

    //returns the min number of integer array
    public static int minNumber(int[]array) {
        Arrays.sort(array);
        return array[0];
    }

    //returns the min number of double array
    public static double minNumber(double[]array) {
        Arrays.sort(array);
        return array[0];
    }
    
    //checks if the given double is contained in the given array.returns boolean contains(double[],int)
    public static boolean contains(double[]array,double element){
        boolean result=false;

        for (double each : array) {
            if (each==element)
                result=true;
            
        }
        return result;
        
        
    }
    //checks if the given int is contained in the given array.returns boolean contains(int[],int)
    public static boolean contains(int[]array,int element){
        boolean result=false;

        for (int each : array) {
            if (each==element)
                result=true;

        }
        return result;


    }

    //checks if the given String is contained in the given array.returns boolean contains(String[],int)
    public static boolean contains(String[]array,String element){
        boolean result=false;

        for (String each : array) {
            if (each==element)
                result=true;

        }
        return result;


    }

    //checks if the given char is contained in the given array.returns boolean contains(char[],int)
    public static boolean contains(char[]array,char element){
        boolean result=false;

        for (char each : array) {
            if (each==element)
                result=true;

        }
        return result;


    }
    
    
    
    
}
