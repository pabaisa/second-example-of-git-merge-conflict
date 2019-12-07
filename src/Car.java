public class Car {

    private String model;
    private double price;

    public Car(String model) {
        this.model = model;
    }

    public Car(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
