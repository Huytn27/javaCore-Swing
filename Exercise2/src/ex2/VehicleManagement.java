package ex2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VehicleManagement {
    private ArrayList<Vehicle> vehicleList;
    private ArrayList<Car> carList;
    private ArrayList<MotoBike> motoBikeList;
    private ArrayList<XeTai> xeTaiList;

    public VehicleManagement() {
        vehicleList = new ArrayList<>();
        carList = new ArrayList<>();
        motoBikeList = new ArrayList<>();
        xeTaiList = new ArrayList<>();
    }

    private void addMotoBike() {
        Scanner scanner = new Scanner(System.in);
        String brand;
        int year;
        int price;
        String color;
        int congSuat;
        System.out.print("Hang san xuat: ");
        brand = scanner.nextLine();
        do {
            System.out.print("Nam san xuat: ");
            year = Integer.parseInt(scanner.nextLine());
            if(year < 2020)
                break;
            else
                System.out.println("Vui long nhap lai.\n");
        } while(true);
        System.out.print("Gia: ");
        price = Integer.parseInt(scanner.nextLine());
        System.out.print("Mau: ");
        color = scanner.nextLine();
        System.out.print("Cong suat: ");
        congSuat = Integer.parseInt(scanner.nextLine());
        vehicleList.add(new MotoBike(brand, year, price, color, congSuat));
        motoBikeList.add(new MotoBike(brand, year, price, color, congSuat));
    }

    private void addCar() {
        Scanner scanner = new Scanner(System.in);
        String brand;
        int year;
        int price;
        String color;
        String kieuDongCo;
        int soChoNgoi;
        System.out.print("Hang san xuat: ");
        brand = scanner.nextLine();
        do {
            System.out.print("Nam san xuat: ");
            year = Integer.parseInt(scanner.nextLine());
            if(year < 2020)
                break;
            else
                System.out.println("Vui long nhap lai.\n");
        } while(true);
        System.out.print("Gia: ");
        price = Integer.parseInt(scanner.nextLine());
        System.out.print("Mau: ");
        color = scanner.nextLine();
        System.out.print("Kieu dong co: ");
        kieuDongCo = scanner.nextLine();
        System.out.println("So cho ngoi: ");
        soChoNgoi = Integer.parseInt(scanner.nextLine());
        vehicleList.add(new Car(brand, year, price, color, kieuDongCo, soChoNgoi));
        carList.add(new Car(brand, year, price, color, kieuDongCo, soChoNgoi));
    }

    private void addXeTai() {
        Scanner scanner = new Scanner(System.in);
        String brand;
        int year;
        int price;
        String color;
        int trongTai;
        System.out.print("Hang san xuat: ");
        brand = scanner.nextLine();
        do {
            System.out.print("Nam san xuat: ");
            year = Integer.parseInt(scanner.nextLine());
            if(year < 2020)
                break;
            else
                System.out.println("Vui long nhap lai.\n");
        } while(true);
        System.out.print("Gia: ");
        price = Integer.parseInt(scanner.nextLine());
        System.out.print("Mau: ");
        color = scanner.nextLine();
        System.out.println("Trong tai: ");
        trongTai = Integer.parseInt(scanner.nextLine());
        vehicleList.add(new XeTai(brand, year, price, color, trongTai));
        xeTaiList.add(new XeTai(brand, year, price, color, trongTai));
    }

    public void nhapThem() {
        Scanner scanner = new Scanner(System.in);
        int luaChon = 1;

        do {
            System.out.print("1. Nhap them xe may.\n" +
                    "2. Nhap them o to.\n" +
                    "3. Nhap them xe tai.\n" +
                    "0. Thoat.\n" +
                    "Nhap lua chon: ");
            luaChon = Integer.parseInt(scanner.nextLine());
            switch (luaChon) {
                case 0:
                    break;
                case 1:
                    addMotoBike();
                    break;
                case 2:
                    addCar();
                    break;
                case 3:
                    addXeTai();
                    break;
                default:
                    System.out.println("Vui long nhap lai.");
            }
        } while(luaChon != 0);
    }

    private <T>void showAll(ArrayList<T> list) {
        for (T t : list) {
            System.out.println(t);
        }
        System.out.println("Sum = " + list.size());
    }

    private void showByKind() {
        showAll(motoBikeList);
        showAll(carList);
        showAll(xeTaiList);
    }

    public void show() {
        Scanner scanner = new Scanner(System.in);
        int luaChon = 1;

        do {
            System.out.print("1. In ra toan bo.\n" +
                    "2. In ra moi phuong tien 1 bang.\n" +
                    "0. Thoat.\n" +
                    "Nhap lua chon: ");
            luaChon = Integer.parseInt(scanner.nextLine());

            switch (luaChon) {
                case 0:
                    break;
                case 1:
                    showAll(vehicleList);
                    break;
                case 2:
                    showByKind();
                    break;
                default:
                    System.out.println("Vui long nhap lai.");
            }
        } while(luaChon != 0);
    }

}
