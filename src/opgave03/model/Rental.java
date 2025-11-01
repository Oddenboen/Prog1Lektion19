package opgave03.model;

import java.util.ArrayList;

public class Rental {
    int number;
    int days;
    String date;
    ArrayList<Car> cars;

    public Rental(int number, String date, int days) {
        this.number = number;
        this.date = date;
        this.days = days;
        this.cars = new ArrayList<Car>();
    }

    public void addCar(Car car) {
        this.cars.add(car);
    }

    public double getPrice() {
        double price = 0;

        for (Car car : cars) {
            price += car.getDayPrice();
        }

        return price * days;
    }
}
