public class Car {

    private String model;
    private int year;
    private double price;
    public Car(int year) {
        this.year = year;
    }


    public Car(String model) {
        this.model = model;
    }



    public int getYear() {
        return year;
    }
}
