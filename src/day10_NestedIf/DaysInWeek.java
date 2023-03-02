package day10_NestedIf;

public class DaysInWeek {

    public static void main(String[] args) {

        int day=8;
        String result="";
        result =(day>=1&&day<=7)? (day==1)?"monday":(day==2)?"tuesday":(day==3)?"wednesday":(day==4)?"thursday":(day==5)?"friday":(day==6)?"saturday":"sunday":"invalid";
        System.out.println(result);

}}
