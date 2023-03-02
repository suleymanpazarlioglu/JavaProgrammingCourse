package day17_While_DoWhile;

public class BranchingStatements {
    public static void main(String[] args) {

        for (char i = 'A'; i <= 'Z' ; i++) {
           if (i=='F') break;
            System.out.print(i+" ");

        }
        System.out.println();
        System.out.println("-----------------------");

        for (char i = 'A'; i <= 'Z' ; i++) {
            if (i=='F') continue;//all letters is printed except 'F'
            System.out.print(i+" ");

        }
        System.out.println();

        for (int i = 0; i <=10 ; i++) {
            if (i%2==0) continue;
            System.out.println(i);

        }

        System.out.println();

        for (int i = 0; i <=10 ; i++) {
            if (i%2==1) continue;
            System.out.println(i);

        }



    }
}
