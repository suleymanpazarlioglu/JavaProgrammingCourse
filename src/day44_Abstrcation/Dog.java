package day44_Abstrcation;

public final class Dog extends Animal implements Playable{

    public Dog(String name, String breed, char gender, int age, double size, String color) {
        super(name, breed, gender, age, size, color);
    }
    public void play(){
        System.out.println(getName() +" is playing with ball");
    }

    public void bark(){
        System.out.println(getName()+" is barking");
    }

    public void eat() {
        System.out.println(getName()+" eats Pizza");
    }



}
