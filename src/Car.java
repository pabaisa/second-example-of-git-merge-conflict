public class Car {

    private String model;
    private int price;
    private int year;
    private String color;

    public Car(String model, String color) {
        this.model = model;
        this.color=color;
    }

    public String getColor() {
        return color;
    }

    public Car(int price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
