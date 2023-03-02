package day34_GarbageCollection_AccessModifiers;

public class StaticBlock {
    public static void main(String[] args) {
        System.out.println("Main method 1");
    }

    static{
        System.out.println("static block");

    }
    static{
        System.out.println("static block 2");

    }
    static{
        System.out.println("static block 3");

    }
}
