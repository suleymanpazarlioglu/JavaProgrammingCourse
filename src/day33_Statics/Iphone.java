package day33_Statics;

public class Iphone {

     public static  String brand="Apple";
     public String model;
     public double price;
     public static String OS="iOS";
     public String color;
     public String size;
     public static String madeIn="China";
     public static boolean hadBattery=true;
     public static boolean isTouchScreen=true;
     public static boolean hasFaceTime=true;

     public void printModelAndPrice(){
          System.out.println(model+"  "+price);
          System.out.println(OS);
     }

     public static void printOS(){
          System.out.println(OS);
     }


}
