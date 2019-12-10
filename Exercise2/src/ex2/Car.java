package ex2;

public class Car extends Vehicle {
    private String kieuDongCo;
    private int soChoNgoi;

    public Car(String kieuDongCo, int soChoNgoi) {
        this.kieuDongCo = kieuDongCo;
        this.soChoNgoi = soChoNgoi;
    }

    public Car(String brand, int year, int price, String color, String kieuDongCo, int soChoNgoi) {
        super(brand, year, price, color);
        this.kieuDongCo = kieuDongCo;
        this.soChoNgoi = soChoNgoi;
    }

    public String getKieuDongCo() {
        return kieuDongCo;
    }

    public void setKieuDongCo(String kieuDongCo) {
        this.kieuDongCo = kieuDongCo;
    }

    public int getSoChoNgoi() {
        return soChoNgoi;
    }

    public void setSoChoNgoi(int soChoNgoi) {
        this.soChoNgoi = soChoNgoi;
    }

    @Override
    public String toString() {
        return "Car{" +
                "kieuDongCo='" + kieuDongCo + '\'' +
                ", soChoNgoi=" + soChoNgoi +
                ", brand='" + brand + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
