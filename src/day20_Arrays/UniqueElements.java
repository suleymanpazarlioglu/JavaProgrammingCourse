package day20_Arrays;

public class UniqueElements {
    public static void main(String[] args) {

        String[] words={"Java","Java","C#","JavaScript","Python","Python"};

        String result="";
        for (int i = 0; i < words.length; i++) {
            int count=0;
            for (int j = 0; j < words.length; j++) {
                if (words[i].equals(words[j]))
                    count++;

            }
            if(count==1){
                result+=words[i];
                result+=" ";}

        }

        System.out.println("unique words: "+result);



    }
}
