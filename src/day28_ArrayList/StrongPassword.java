package day28_ArrayList;

public class StrongPassword {
    public static void main(String[] args) {

        String password="Cydeo1990@";

        boolean r1=password.length()>=8 && !password.contains(" ");
        boolean r2=false;
        boolean r3=false;
        boolean r4=false;
        boolean r5=false;

        char[] chars=password.toCharArray();

        for(char each:chars){
            if(Character.isUpperCase(each)){
                r2=true;
            } else if (Character.isLowerCase(each)) {
                r3=true;
            } else if (Character.isDigit(each)) {
                r4=true;
            }
            else r5=true;
        }

        if (r1 && r2 && r3 && r4 && r5)
        System.out.println("Strong password");
        else System.out.println("invalid");


    }
}
