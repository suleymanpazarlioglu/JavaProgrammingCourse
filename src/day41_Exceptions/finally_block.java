package day41_Exceptions;
import java.lang.Object;
import day39_Recap.cydeoTask.Student;

public class finally_block {
    public static void main(String[] args) {
        int [] arr={1,2,3};

        try{
            System.out.println(arr[10]);
            System.out.println("try block");
        }
        catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
            System.out.println("catch block");
        }
        finally {
            System.out.println("finally blıck");
        }
        System.out.println("test completed");


    }
}
