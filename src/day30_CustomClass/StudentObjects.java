package day30_CustomClass;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;

public class StudentObjects {
    public static void main(String[] args) {

        Student s1=new Student();
        s1.setInfo("Süleyman",'M',34,533850,'A');
        //System.out.println(s1);

        Student s2=new Student();
        s2.setInfo("Rıdvan",'M',32,12345,'B');
        //System.out.println(s2);

        Student s3=new Student();
        s3.setInfo("Burak",'M',34,54322,'C');
        //System.out.println(s3);

        Student s4=new Student();
        s4.setInfo("Refik",'M',30,12312,'A');
        //System.out.println(s4);

        Student s5=new Student();
        s5.setInfo("Ayşe",'F',33,21321,'B');
        //System.out.println(s5);

        Student[] students={s1,s2,s3,s4,s5};
        for (Student each:students) {
            System.out.println(each);
        }
        System.out.println("-----------------------------------------");

        ArrayList<Student> earlyBirds=new ArrayList<>();
        ArrayList<Student> angryBirds=new ArrayList<>();

        for (Student student : students) {
            if(student.grade=='A')
                earlyBirds.add(student);
            else angryBirds.add(student);
        }
        System.out.println(earlyBirds);
        System.out.println("---------------------------------------");
        System.out.println(angryBirds);


    }
}
