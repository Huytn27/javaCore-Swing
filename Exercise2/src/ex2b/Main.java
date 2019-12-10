package ex2b;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        VehicleManagement vehicleManagement = VehicleManagement.getInstance();
        int choose = 1;

        do {
            VehicleManagement.showMenu();
            choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 0:
                    break;
                case 1:
                    vehicleManagement.add();
                    break;
                case 2:
                    vehicleManagement.showAll();
                    break;
                case 3:
                    vehicleManagement.search();
                    break;
                case 4:
                    vehicleManagement.searchTheoKhoang();
                    break;
                case 5:
                    vehicleManagement.sort();
                    break;
                default:
                    System.out.println("Choose again.");
            }
        } while (choose != 0);

    }
}
