package day09_IfStatements;

public class MinNumber {
    public static void main(String[] args) {

        int n1=300,n2=200;
        if (n1<n2) System.out.println(n1+" is the minimum number");
        else if (n1>n2) System.out.println(n2+" is the minimum number");
        else System.out.println(n1+" and "+n2+" equal number");
    }
}
