package day08_IfStatements;

public class SingleIfStatementIntro {
    public static void main(String[] args) {

        int number=300;

        boolean evenNumber=number%2==0;;
        boolean oddnumber=!evenNumber;

        if(evenNumber){
            System.out.println(number+" is even number");
        }
        if(oddnumber){
            System.out.println(number+" is odd number");
        }

        System.out.println("----------------------------------------------");

        int n=1;

        if (n>0) System.out.println("pozitif");
        if (n==0) System.out.println("zero");
        if (n<0) System.out.println("negatif");



    }
}
