package day08_IfStatements;

public class LogicalOperators {
    public static void main(String[] args) {

        int age=19;
        String citizen="USA";
        String name="Steven";

        boolean isEligible=age>=18 && citizen=="USA" && name=="Steven";
        System.out.println("isEligible = " + isEligible);

        boolean isEligible2=age>=18 || citizen=="USA";
        System.out.println("isEligible2 = " + isEligible2);



    }
}
