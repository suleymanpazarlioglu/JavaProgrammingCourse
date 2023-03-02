package day24_CustomMethod_Return;

public class ReturnMethodPractice {
    public static int maxNumber(int firstNumber,int secondNumber){
        if (firstNumber>=secondNumber) return firstNumber;
        else return secondNumber;
    }

    public static void main(String[] args) {
        System.out.println(maxNumber(5,4));
    }
}
