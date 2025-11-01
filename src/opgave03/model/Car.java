package opgave03.model;

public class Car {
    String license;
    double pricePerDay;
    int purchaseYear;

    public Car (String license, int purchaseYear) {
        this.license = license;
        this.purchaseYear = purchaseYear;
    }

    public void setDayPrice(double dayPrice) {
        this.pricePerDay = dayPrice;
    }

    public double getDayPrice() {
        return pricePerDay;
    }

    public String getLicense() {
        return license;
    }

    public int getPurchaseYear() {
        return purchaseYear;
    }
}
