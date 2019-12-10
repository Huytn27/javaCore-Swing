package ex2b;

import java.util.Scanner;

public class Moto extends Vehicle {
    private int congSuat;

    public Moto() {
    }

    public Moto(int congSuat) {
        this.congSuat = congSuat;
    }

    public Moto(String hangSx, int namSx, int price, String color, int congSuat) {
        super(hangSx, namSx, price, color);
        this.congSuat = congSuat;
    }

    @Override
    public String toString() {
        return "Moto{" +
                "congSuat=" + congSuat +
                super.toString() +
                '}';
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        super.input();
        System.out.print("Cong suat: ");
        congSuat = Integer.parseInt(scanner.nextLine());
    }

    public int getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(int congSuat) {
        this.congSuat = congSuat;
    }
}
