package day43_Abstraction.car;

public class CarShop {
    public static void main(String[] args) {
    Honda honda=new Honda("Acoord","Black",2019,30000);
    Audi audi=new Audi("Q7","White",2020,40000);
    Tesla tesla=new Tesla("MODEL x","Blue",2021,60000);

        System.out.println(honda);
        System.out.println(audi);
        System.out.println(tesla);

        System.out.println("-----------------------------");

        honda.setColor("Red");
        audi.setColor("Pink");
        tesla.setColor("Green");

        honda.setPrice(25000);
        audi.setPrice(40000);
        tesla.setPrice(55000);

        System.out.println(honda);
        System.out.println(audi);
        System.out.println(tesla);








    }
}
