package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {
    public static void main(String[] args) {

        ArrayList<Integer> list=new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,3,3,3,3,3,3,4,5,5,5,5,5,5,6,7,8,8,8,8,8));
        System.out.println(list);

        list.removeAll(Arrays.asList(3,5,8));
        System.out.println(list);

        System.out.println("-------------------------");

        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));

        numbers.retainAll(Arrays.asList(2,4,6,8));
        System.out.println(numbers);

        System.out.println("----------------------");

        ArrayList<Integer> nums=new ArrayList<>();

        nums.addAll(Arrays.asList(1,2,3,4,5,6,7,1,2,3,8,9,10));

        boolean r1=nums.contains(10);

        boolean r2=nums.containsAll(Arrays.asList(2,5,10));

        System.out.println(r2);


    }
}
