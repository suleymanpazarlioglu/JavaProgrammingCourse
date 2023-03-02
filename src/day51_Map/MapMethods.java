package day51_Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapMethods {
    public static void main(String[] args) {

        Map<String,Integer> students=new HashMap<>();

        students.put("Suleyman",99);
        students.put("ali",98);
        students.put("veli",97);
        students.put("Selim",96);
        students.put("Kerem",95);
        students.put("meryem",94);

        System.out.println(students);
        System.out.println(students.size());
        System.out.println(students.get("ali"));

        students.replace("ali",100);
        System.out.println(students);

        students.remove("ali");
        System.out.println(students);

        System.out.println(students.containsKey("veli"));

        System.out.println(students.containsValue(99));

        System.out.println(students.isEmpty());

        Map<String ,Integer> map1=new HashMap<>();
        map1.putAll(students);

        Map<String ,Integer> map2=new HashMap<>();
        map2.putAll(students);

        System.out.println(map1 == map2);
        System.out.println(map1.equals(map2));

        map2.clear();
        System.out.println(map2);

        








    }
}
