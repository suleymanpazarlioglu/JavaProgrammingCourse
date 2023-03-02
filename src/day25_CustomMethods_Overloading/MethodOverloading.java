package day25_CustomMethods_Overloading;

public class MethodOverloading {
    public static int sumOfNumbers( int num1,int num2){
        return num1+num2;
    }
    public static int sumOfNumbers( int num1,int num2,int num3){
        return num1+num2+num3;
    }
    public static int sumOfNumbers( int num1,int num2,int num3,int num4){
        return num1+num2+num3+num4;
    }
    public static double sumOfNumbers(double num1,double num2){
        return num1+num2;
    }
    public static double sumOfNumbers(int num1,int num2,int num3,int num4,int num5){
        return num1+num2+num3+num4+num5;
    }




    public static void main(String[] args) {

        System.out.println(sumOfNumbers(1,2,3,4,5));

        double number=sumOfNumbers(12.3,12.4);
        System.out.println(number);



    }
}
