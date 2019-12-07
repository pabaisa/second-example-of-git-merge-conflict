public class Car {

    private String model;
    private double price;
    private int year;

    public Car(int year) {
        this.year = year;
    }

    public Car(double price) {
        this.price = price;
    }

    public Car(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public int getYear() {
        return year;
    }
}
