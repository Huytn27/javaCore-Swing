package ex2b;

import java.util.Scanner;

public class Car extends Vehicle {
    private String kieuDongCo;
    private int soChoNgoi;

    public Car() {
    }

    public Car(String hangSx, int namSx, int price, String color, String kieuDongCo, int soChoNgoi) {
        super(hangSx, namSx, price, color);
        this.kieuDongCo = kieuDongCo;
        this.soChoNgoi = soChoNgoi;
    }

    @Override
    public String toString() {
        return "Car{" +
                "kieuDongCo='" + kieuDongCo + '\'' +
                ", soChoNgoi=" + soChoNgoi +
                super.toString() +
                '}';
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        super.input();
        System.out.print("Kieu dong co: ");
        kieuDongCo = scanner.nextLine();
        System.out.println("So cho ngoi: ");
        soChoNgoi = Integer.parseInt(scanner.nextLine());
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
}
