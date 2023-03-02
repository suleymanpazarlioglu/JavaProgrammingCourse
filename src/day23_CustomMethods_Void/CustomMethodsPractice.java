package day23_CustomMethods_Void;

public class CustomMethodsPractice {
    public static void hellooWorld5Times(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World");

        }
    }
    public static void helloCydeo5Times(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello Cydeo");
        }
    }

    public static void howAreYou(int count){
        for (int i = 0; i < count; i++) {
            System.out.println("How are you?");

        }
    }

    public static void evenNumbers(int count){
        for (int i = 1; i <=count ; i++) {
            if (i%2==0)
                System.out.print(i+" ");

        }
    }

    public static int summary(int firsData,int secondData){
        int sum=firsData+secondData;
        return sum;
    }

    public static String OddOrEven(int number){
        if (number%2==0)
            return "Even number";
        else return "Odd number";
    }

    public static void main(String[] args) {
        helloCydeo5Times();
        hellooWorld5Times();
        howAreYou(3);
        evenNumbers(15);
        System.out.println();
        System.out.println(summary(3,4));
        System.out.println(OddOrEven(6));
        
    }

}
