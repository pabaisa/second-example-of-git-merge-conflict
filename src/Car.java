public class Car {

    private String model;
    private double price;

    public Car(double price) {
        this.price = price;
    }

    public Car(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }
}
