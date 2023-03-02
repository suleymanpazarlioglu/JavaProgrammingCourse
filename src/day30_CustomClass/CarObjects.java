package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class CarObjects {
    public static void main(String[] args) {

        Car car1=new Car();
        car1.setInfo("Mercedes","CLA200","White",2021,15000);

        System.out.println(car1);

        Car car2=new Car();
        car2.setInfo("BMW","320","blue",2011,12000);

        System.out.println(car2);

        Car car3=new Car();
        car3.setInfo("Audi","A5","grey",2020,18000);

        System.out.println(car3);

        //Car[] cars={car1,car2,car3};

        ArrayList<Car> carsList=new ArrayList<>();
        carsList.addAll(Arrays.asList(car1,car2,car3));

        for (Car each : carsList) {
            System.out.println(each.brand+" : "+each.price);
        }

        System.out.println("--------------------------------------------");

        carsList.removeIf(p-> p.brand.equals("BMW") && p.year>=2005 && p.year<=2015);
        carsList.removeIf(p-> p.brand.equals("Audi") && p.year>=2015 && p.year<=2016);

        System.out.println(carsList);


    }
}
