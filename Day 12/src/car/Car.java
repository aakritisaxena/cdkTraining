package car;

/**
 * Created by saxenaaa on 7/25/2017.
 */
public class Car implements Comparable<Car> {
    private double price;
    private int id;
    private String brand;

    public Car(double price, int id, String brand) {
        this.price = price;
        this.id = id;
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public int compareTo(Car o) {
        if(this.getPrice() ==  o.getPrice()){
            return 0;
        }
        else if(this.getPrice() > o.getPrice()){
            return 1;
        }
        else {
            return -1;

        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "price=" + price +
                ", id=" + id +
                ", brand='" + brand + '\'' +
                '}';
    }
}
