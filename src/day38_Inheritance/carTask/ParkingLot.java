package day38_Inheritance.carTask;

public class ParkingLot {
    public static void main(String[] args) {

        Toyota toyota=new Toyota("corolla",2020,21000,"white",15000);
        Tesla tesla=new Tesla("xxx",2022,35000,"grey",5000);
        BMW bmw=new BMW("520",2019,30000,"blue",35000);

        toyota.start();
        bmw.start();
        tesla.start();







    }
}
