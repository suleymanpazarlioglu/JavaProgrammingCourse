package day39_Recap.cydeoTask;

public class Cydeo {
    public static void main(String[] args) {

        Developer developer=new Developer("Suleyman",34,'M',533850,"Developer",120000);
        Tester tester=new Tester("rıdvan",32,'M',123455,"Tester",60000);
        Teacher teacher=new Teacher("ayse",33,'F',122122,"Teacher",80000);
        Student student=new Student("refik",30,'M',221312,"SDET");

        System.out.println(developer);
        System.out.println(tester);
        System.out.println(teacher);
        System.out.println(student);

        System.out.println("-----------------------------");

        developer.setAge(39);
        System.out.println(developer.getAge());

        System.out.println("----------------------------");

        developer.work();
        tester.work();
        teacher.work();

        System.out.println("----------------------------");

        developer.eat();
        developer.drink();
        developer.sleep();

        developer.fixingBugs();

        System.out.println("-------------------------");

        tester.eat();
        tester.drink();
        tester.sleep();
        tester.createTicket();
    }
}
