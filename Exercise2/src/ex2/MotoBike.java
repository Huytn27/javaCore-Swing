package ex2;

public class MotoBike extends Vehicle {
    private int congSuat;

    public MotoBike() {}

    public MotoBike(int congSuat) {
        this.congSuat = congSuat;
    }

    public MotoBike(String brand, int year, int price, String color, int congSuat) {
        super(brand, year, price, color);
        this.congSuat = congSuat;
    }

    public int getCongSuat() {

        return congSuat;
    }

    public void setCongSuat(int congSuat) {
        this.congSuat = congSuat;
    }

    @Override
    public String toString() {
        return "MotoBike{" +
                "congSuat=" + congSuat +
                ", brand='" + brand + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
