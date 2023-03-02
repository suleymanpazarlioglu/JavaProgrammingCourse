package day08_IfStatements;

public class EligibleToVote {
    public static void main(String[] args) {

        String name="Josh";
        int age=17;
        String citizen="USA";

        if(age>=18 && citizen=="USA") System.out.println("eligible");
        else System.out.println("not eligible");

    }
}
