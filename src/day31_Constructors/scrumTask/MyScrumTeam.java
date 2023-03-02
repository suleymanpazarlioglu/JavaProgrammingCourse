package day31_Constructors.scrumTask;


import java.util.Arrays;

public class MyScrumTeam {
    public static void main(String[] args) {

        Tester tester1=new Tester("Layan",12121,"QA",110000);
        Tester tester2=new Tester("Ali",12321,"SDET",142000);
        Tester tester3=new Tester("Alex",12241,"SE",135000);
        Tester tester4=new Tester("Lala",15421,"SDET",115000);

        Tester[] testers={tester2,tester3,tester4};

        Developer developer1=new Developer("Olga",21312,"Java Developer",125000);
        Developer developer2=new Developer("Aygun",21323,"Jave Master",185000);
        Developer developer3=new Developer("Olga",22312,"Software Developer",135000);
        Developer developer4=new Developer("Osman",21342,"Senior Developer",200000);

        Developer[] developers={developer2,developer3,developer4};

        ScrumTeam scrum=new ScrumTeam("nigara","hüseyin","Neira",14);
        scrum.addTester(tester1);
        scrum.addDeveloper(developer1);

        scrum.addTesters(testers);
        scrum.addDevelopers(developers);

        System.out.println(scrum);

        System.out.println("------------------------");

        for(Tester eachTester : scrum.testerList){
            System.out.println(eachTester.name+" : "+eachTester.salary);
        }

        System.out.println("------------------------");

        for (Developer developer : scrum.devOpsList) {
            System.out.println(developer.name+" : "+developer.salary);
        }

        System.out.println("------------------");

        scrum.removeTester(12321);
        scrum.removeDeveloper(22312);
        System.out.println(scrum);


    }
}
