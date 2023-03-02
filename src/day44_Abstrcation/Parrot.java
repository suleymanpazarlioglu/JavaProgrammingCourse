package day44_Abstrcation;

public final class  Parrot extends Animal implements Flyable,Playable {
    public Parrot(String name, String breed, char gender, int age, double size, String color) {
        super(name, breed, gender, age, size, color);
    }

    public void eat() {
        System.out.println(getName()+" is eating chocolate");
    }

    public void fly(){
        System.out.println(getName()+" can fly 20km/h");

    }
    public void play(){
        System.out.println(getName() +" is playing with ball");
    }

}
