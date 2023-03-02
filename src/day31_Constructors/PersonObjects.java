package day31_Constructors;

public class PersonObjects {
    public static void main(String[] args) {

        Person person1=new Person("Süleyman",'M',34);
        Person person2=new Person("Rıdvan",'M',32);

        person2.age=31;


        System.out.println(person1);
        System.out.println(person2);


    }
}
