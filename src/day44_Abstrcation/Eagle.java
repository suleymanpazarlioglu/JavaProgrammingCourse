package day44_Abstrcation;

public final class Eagle extends Animal implements Flyable,WildAnimal {
    public Eagle(String name, String breed, char gender, int age, double size, String color) {
        super(name, breed, gender, age, size, color);
    }
    public void eat() {
        System.out.println(getName()+" is eating snake");
    }
    public void fly(){
        System.out.println(getName()+" can fly 50km/h");

    }

    @Override
    public void hunt() {
        System.out.println(getName()+" hunts deer");
    }
}
