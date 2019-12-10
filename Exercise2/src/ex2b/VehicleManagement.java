package ex2b;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class VehicleManagement {
    private List<Vehicle> vehicleList = new ArrayList<>();
    public static VehicleManagement vehicleManagement = null;

    private VehicleManagement() {}

    public static VehicleManagement getInstance() {
        if(vehicleManagement == null)
            vehicleManagement = new VehicleManagement();
        return vehicleManagement;
    }

    public static void showMenu() {
        System.out.print("------------MENU------------\n" +
                "1. Add vehicle.\n" +
                "2. Show vehicle.\n" +
                "3. Search vehicle.\n" +
                "4. Search theo khoang.\n" +
                "5. Sort.\n" +
                "0. Exit.\n" +
                "Choose: ");
    }

    public void add() {
        Scanner scanner = new Scanner(System.in);
        int choose = 1;

        do {
            System.out.print("1. Nhap them Xe oto.\n" +
                    "2. Nhap them Xe may.\n" +
                    "3. Nhap them Xe tai.\n" +
                    "0. Thoat.\n" +
                    "Choose: ");

            choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 0:
                    break;
                case 1:
                    Car car = new Car();
                    car.input();
                    if(!vehicleList.contains(car))
                        vehicleList.add(car);
                    break;
                case 2:
                    Moto moto = new Moto();
                    moto.input();
                    if(!vehicleList.contains(moto))
                        vehicleList.add(moto);
                    break;
                case 3:
                    XeTai xeTai = new XeTai();
                    xeTai.input();
                    if(!vehicleList.contains(xeTai))
                        vehicleList.add(xeTai);
                    break;
                default:
                    System.out.println("Choose again.");
            }
        } while (choose != 0);
    }

    public void showAll() {
        Scanner scanner = new Scanner(System.in);
        int choose = 1;

        do {
            System.out.print("1. In ra toan bo PTGT.\n" +
                    "2. In ra PTGT theo tung loai.\n" +
                    "0. Thoat.\n" +
                    "Choose: ");
            choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 0:
                    break;
                case 1:
                    System.out.println("---------LIST_VEHICLE----------");
                    vehicleList.forEach(vehicle -> {
                        System.out.println(vehicle);
                    });
                    break;
                case 2:
                    System.out.println("---------LIST_CAR----------");
                    vehicleList.forEach(vehicle -> {
                        if(vehicle instanceof  Car)
                            System.out.println(vehicle);
                    });

                    System.out.println("---------LIST_MOTO----------");
                    vehicleList.forEach(vehicle -> {
                        if(vehicle instanceof  Moto)
                            System.out.println(vehicle);
                    });

                    System.out.println("---------LIST_XE_TAI----------");
                    vehicleList.forEach(vehicle -> {
                        if(vehicle instanceof  XeTai)
                            System.out.println(vehicle);
                    });
                    break;
                default:
                    System.out.println("Choose again.");
            }
        } while (choose != 0);
    }

    public void search() {
        Scanner scanner = new Scanner(System.in);
        int choose = 1;

        do {
            System.out.print("1. Search by HangSx.\n" +
                    "2. Search by NamSx.\n" +
                    "3. Search by price.\n" +
                    "4. Search by color.\n" +
                    "5. Search by soChoNgoi.\n" +
                    "0. Thoat.\n" +
                    "Choose: ");

            choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 0:
                    break;
                case 1:
                    System.out.println("Hang sx: ");
                    String hangSx = scanner.nextLine();
                    vehicleList.forEach(vehicle -> {
                        if(vehicle.getHangSx().equalsIgnoreCase(hangSx))
                            System.out.println(vehicle);
                    });
                case 2:
                    System.out.print("Nam sx: ");
                    int namSx = Integer.parseInt(scanner.nextLine());
                    vehicleList.forEach(vehicle -> {
                        if(vehicle.getNamSx() == namSx)
                            System.out.println(vehicle);
                    });
                    break;
                case 3:
                    System.out.print("Price: ");
                    int price = Integer.parseInt(scanner.nextLine());
                    vehicleList.forEach(vehicle -> {
                        if(vehicle.getPrice() == price)
                            System.out.println(vehicle);
                    });
                    break;
                case 4:
                    System.out.print("Color: ");
                    String color = scanner.nextLine();
                    vehicleList.forEach(vehicle -> {
                        if (vehicle.getColor().equalsIgnoreCase(color))
                            System.out.println(vehicle);
                    });
                    break;
                case 5:
                    System.out.print("So cho ngoi: ");
                    int soChoNgoi = Integer.parseInt(scanner.nextLine());
                    vehicleList.forEach(vehicle -> {
                        if(vehicle instanceof Car)
                            if(((Car) vehicle).getSoChoNgoi() == soChoNgoi)
                                System.out.println(vehicle);
                    });
                    break;
                default:
                    System.out.println("Choose again.");
            }
        } while (choose != 0);
    }

    private void show() {
        vehicleList.forEach(vehicle -> {
            System.out.println(vehicle);
        });
    }

    public void sort() {
        Scanner scanner = new Scanner(System.in);
        int choose = 1;

        do {
            System.out.print("1. Sort by HangSx.\n" +
                    "2. Sort by price.\n" +
                    "3. Sort by NamSx.\n" +
                    "0. Thoat.\n" +
                    "Choose: ");

            choose = Integer.parseInt(scanner.nextLine());

            switch (choose) {
                case 0:
                    break;
                case 1:
                    Collections.sort(vehicleList, (o1, o2) -> {
                        return o1.getHangSx().compareToIgnoreCase(o2.getHangSx());
                    });
                    show();
                    break;
                case 2:
                    Collections.sort(vehicleList, (o1, o2) -> {
                        return  o1.getPrice() - o2.getPrice();
                    });
                    show();
                    break;
                case 3:
                    Collections.sort(vehicleList, (o1, o2) -> {
                        return o1.getNamSx() - o2.getNamSx();
                    });
                    show();
                    break;
                default:
                    System.out.println("Choose again.");
            }
        } while(choose != 0);
    }

    public void searchTheoKhoang() {
        Scanner scanner = new Scanner(System.in);
        int choose = 1;

        do {
            System.out.print("Search theo khoang by nam sx.\n" +
                    "2. Search theo khoang by price.\n" +
                    "0. Thoat.\n" +
                    "Choose: ");

            choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 0:
                    break;
                case 1:
                    System.out.println("Nam bat dau: ");
                    int st = Integer.parseInt(scanner.nextLine());
                    System.out.println("Nam ket thuc: ");
                    int en = Integer.parseInt(scanner.nextLine());
                    vehicleList.forEach(vehicle -> {
                        if (vehicle.getNamSx() > st && vehicle.getNamSx() < en)
                            System.out.println(vehicle);
                    });
                    break;
                case 2:
                    System.out.println("Gia bat dau: ");
                    int stp = Integer.parseInt(scanner.nextLine());
                    System.out.println("Gia ket thuc: ");
                    int enp = Integer.parseInt(scanner.nextLine());
                    vehicleList.forEach(vehicle -> {
                        if(vehicle.getPrice() > stp && vehicle.getPrice() < enp)
                            System.out.println(vehicle);
                    });
            }
        } while(choose != 0);
    }

}
