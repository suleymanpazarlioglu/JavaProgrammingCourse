package day09_IfStatements;

public class MedianNumber {
    public static void main(String[] args) {

        int a=30,b=15,c=60;

        if ((a<b && b<c) || (a>b && b>c)) System.out.println(b+" is Median Number");
        else if ((a<b && a>c) || (a>b && a<c)) System.out.println(a+" is Median Number");
        else System.out.println(c+" is Median Number");
    }
}
