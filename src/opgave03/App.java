package opgave03;

import opgave03.model.Car;
import opgave03.model.Rental;

public class App {
    public static void main(String[] args) {
        Car car1 = new Car("XD123456",2000);
        Car car2 = new Car("2",2002);
        Car car3 = new Car("3",2003);
        Car car4 = new Car("4",2004);
        Car car5= new Car("5", 2005);
        car1.setDayPrice(100);
        car2.setDayPrice(50);
        car3.setDayPrice(67);
        car4.setDayPrice(69);
        car5.setDayPrice(9001);

        Rental kontrakt1 = new Rental(1,"1/11",4);
        Rental kontrakt2 = new Rental(2,"27/5",2);

        kontrakt1.addCar(car1);
        kontrakt1.addCar(car2);
        kontrakt1.addCar(car5);

        kontrakt2.addCar(car3);
        kontrakt2.addCar(car4);

        System.out.println(kontrakt1.getPrice());
        System.out.println(kontrakt2.getPrice());
    }
}
