package day44_Abstrcation;

public final class Tiger extends Animal implements WildAnimal{
    public Tiger(String name, String breed, char gender, int age, double size, String color) {
        super(name, breed, gender, age, size, color);
    }
    public void eat() {
        System.out.println(getName()+" is eating deer");
    }
    public void hunt() {
        System.out.println(getName()+" hunts snake");
    }
}
