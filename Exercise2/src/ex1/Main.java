package ex1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PhoneBook phoneBook = PhoneBook.getInstanceof();
        int choose = 1;

        do {
            PhoneBook.showMenu();
            choose = Integer.parseInt(scanner.nextLine());

            switch (choose) {
                case 0:
                    break;
                case 1:
                    phoneBook.add();
                    break;
                case 2:
                    phoneBook.searchByMaVung();
                    break;
                case 3:
                    phoneBook.showAll();
                    break;
                case 4:
                    phoneBook.sumByMaVung();
                    break;
                case 5:
                    phoneBook.searchEndWith();
                    break;
                default:
                    System.out.println("Choose again.");
            }
        } while(choose != 0);
    }
}
