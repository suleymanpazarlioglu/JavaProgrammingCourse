package day10_NestedIf;

public class TernariesIntro {
    public static void main(String[] args) {
        int n=100;

        if (n%2==0)
            System.out.println("Even");
        else System.out.println("Odd");

        System.out.println("--------------------------");

        System.out.println((n%2==0)?"Even":"Odd");
        String result=(n%2==0)?"Even":"Odd";

        System.out.println("--------------------------");

        int age=21;

        String result2=(age>=21)?"Eliglible":"Not Eliglible";
        System.out.println(result2);

        System.out.println("--------------------------");

        int number=100;

        String result3=(number>0)? "pozitive":(number<0)? "negative":"zero";

        System.out.println(result3);
        System.out.println("--------------------------");






    }
}
