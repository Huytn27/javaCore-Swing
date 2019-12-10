package ex3;

import java.text.ParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        int luaChon = 1;
        QuanLiTaiLieu quanLiTaiLieu = new QuanLiTaiLieu();

        do {
            QuanLiTaiLieu.showMenu();
            luaChon = Integer.parseInt(scanner.nextLine());

            switch (luaChon) {
                case 0:
                    break;
                case 1:
                    quanLiTaiLieu.add();
                    break;
                case 2:
                    quanLiTaiLieu.show();
                    break;
                case 3:
                    quanLiTaiLieu.edit();
                    break;
                case 4:
                    quanLiTaiLieu.delete();
                    break;
                case 5:
                    quanLiTaiLieu.thongKe();
                    break;
                case 6:
                    quanLiTaiLieu.sortByTenNxb();
                    break;
                case 7:
                    quanLiTaiLieu.sortBySoBan();
                    break;
                default:
                    System.out.println("Vui long nhap lai.");
            }
        } while (luaChon != 0);
    }
}
