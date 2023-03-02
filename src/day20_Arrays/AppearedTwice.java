package day20_Arrays;

public class AppearedTwice {
    public static void main(String[] args) {

        char[] chars={'A','A','A','B','C','C','D','D','D'};

        String result="";
        for (int i = 0; i < chars.length; i++) {
            int count=0;
            for (int j = 0; j < chars.length; j++) {
                if (chars[i]==chars[j])
                    count++;

            }
            if(count==2){
                result+=chars[i];
                }

        }

        System.out.println("twice: "+result.charAt(0));


    }


}
