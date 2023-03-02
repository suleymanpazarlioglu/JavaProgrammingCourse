package day37_Inheritance.EmployeeTask;

public class Employee {

    public String name;
    public int age;
    public int ID;
    public char gender;
    public String jobTitle;
    public double salary;

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", ID=" + ID +
                ", gender=" + gender +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }

    public Employee(String name, int age, int ID, char gender, String jobTitle, double salary) {
        this.name = name;
        this.age = age;
        this.ID = ID;
        this.gender = gender;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

}
