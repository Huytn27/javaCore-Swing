package ex2b;

import java.util.Scanner;

public class Vehicle {
    private String hangSx;
    private int namSx;
    private int price;
    private String color;

    public Vehicle() {
    }

    public Vehicle(String hangSx, int namSx, int price, String color) {
        this.hangSx = hangSx;
        this.namSx = namSx;
        this.price = price;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "hangSx='" + hangSx + '\'' +
                ", namSx=" + namSx +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hang sx: ");
        hangSx = scanner.nextLine();
        do {
            System.out.print("Nam sx: ");
            namSx = Integer.parseInt(scanner.nextLine());
            if(namSx > 0 && namSx < 2020)
                break;
        } while (true);
        System.out.print("Price: ");
        price = Integer.parseInt(scanner.nextLine());
        System.out.print("Color: ");
        color = scanner.nextLine();
    }

    @Override
    public boolean equals(Object obj) {
        Vehicle vehicle = (Vehicle) obj;
        return this.getHangSx().equalsIgnoreCase(vehicle.getHangSx());
    }

    public String getHangSx() {
        return hangSx;
    }

    public void setHangSx(String hangSx) {
        this.hangSx = hangSx;
    }

    public int getNamSx() {
        return namSx;
    }

    public void setNamSx(int namSx) {
        this.namSx = namSx;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
