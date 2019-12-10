package ex2;

public class XeTai extends Vehicle {
    private int trongTai;

    public XeTai(int trongTai) {
        this.trongTai = trongTai;
    }

    public XeTai(String brand, int year, int price, String color, int trongTai) {
        super(brand, year, price, color);
        this.trongTai = trongTai;
    }

    public int getTrongTai() {
        return trongTai;
    }

    public void setTrongTai(int trongTai) {
        this.trongTai = trongTai;
    }

    @Override
    public String toString() {
        return "XeTai{" +
                "trongTai=" + trongTai +
                ", brand='" + brand + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
