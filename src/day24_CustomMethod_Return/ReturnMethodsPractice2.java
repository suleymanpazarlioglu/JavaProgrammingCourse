package day24_CustomMethod_Return;

public class ReturnMethodsPractice2 {

    public static String grade(int score){
        String result="";
        if(score<0||score>100){
            System.out.println("invalid");
            return result;
        }

        if (score>=90) {
            result+="A-excellent";
        }
        else if (score>=80) {
            result+="B-great";
        }
        else if (score>=90) {
            result+="C-good";
        }
        else if (score>=90) {
            result+="D-pass";
        }
        else
            result+="F-fail";

        return result;


    }

    public static void main(String[] args) {
        System.out.println(grade(40));
    }
}
