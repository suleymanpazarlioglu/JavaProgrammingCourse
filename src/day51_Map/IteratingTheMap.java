package day51_Map;

import java.util.*;

public class IteratingTheMap {
    public static void main(String[] args) {
        Map<String,Integer> students=new HashMap<>();

        students.put("Suleyman",79);
        students.put("ali",98);
        students.put("veli",77);
        students.put("Selim",76);
        students.put("Kerem",75);
        students.put("meryem",95);

        Set<String> keys= students.keySet();

        /*for (String eachKey:keys){
            students.replace(eachKey,students.get(eachKey)+5);
        }*/

        System.out.println(students);

        Map<String,Integer> earlyBirds=new HashMap<>();
        Map<String,Integer> angeyBirds=new HashMap<>();

        for (String key: students.keySet()){
            Integer value=students.get(key);
            if (value>=90){
                earlyBirds.put(key,value);
            }else{
                angeyBirds.put(key,value);
            }
        }

        System.out.println("earlyBirds = " + earlyBirds);
        System.out.println("angeyBirds = " + angeyBirds);

        Set<String> names=students.keySet();

        System.out.println("---------------------------------------");

        //Collection<Integer> scores=students.values();

        List<Integer> scores=new ArrayList<>(students.values());

        System.out.println(scores);

        System.out.println("--------------------------------");

        int maxScore=Integer.MIN_VALUE;
        int minScore=Integer.MAX_VALUE;
        for (Integer score : students.values()) {
            if (score > maxScore)
                maxScore = score;
            if (score < minScore)
                minScore = score;
        }



        System.out.println("maxScore = " + maxScore);
        System.out.println("minScore = " + minScore);


        System.out.println("--------------------------");

        int max=Collections.max(students.values());
        int min=Collections.min(students.values());

        System.out.println("min = " + min);
        System.out.println("max = " + max);


        System.out.println("---------------------");

        int count=0;
        for (Integer score : students.values()) {
            if (score>=95)
                count++;

        }
        System.out.println("count = " + count);

        System.out.println("---------------------");
        count=0;
        for (String eachKey : students.keySet()){
            Integer eachScore=students.get(eachKey);
            if (eachScore>=95)
                count++;
        }
        System.out.println("count = " + count);

        System.out.println("------------------------------");

        for (Map.Entry<String, Integer> entry : students.entrySet()) {
            //System.out.println(entry);
            System.out.println(entry.getKey()+" : "+entry.getValue());

        }


    }
}
