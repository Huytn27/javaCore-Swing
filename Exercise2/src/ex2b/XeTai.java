package ex2b;

import java.util.Scanner;

public class XeTai extends Vehicle {
    private int trongTai;

    public XeTai() {
    }

    public XeTai(int trongTai) {
        this.trongTai = trongTai;
    }

    public XeTai(String hangSx, int namSx, int price, String color, int trongTai) {
        super(hangSx, namSx, price, color);
        this.trongTai = trongTai;
    }

    @Override
    public String toString() {
        return "XeTai{" +
                "trongTai=" + trongTai +
                super.toString() +
                '}';
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        super.input();
        System.out.print("Trong tai: ");
        trongTai = Integer.parseInt(scanner.nextLine());
    }

    public int getTrongTai() {
        return trongTai;
    }

    public void setTrongTai(int trongTai) {
        this.trongTai = trongTai;
    }
}
