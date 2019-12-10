package ex1;

import java.util.*;

public class PhoneBook {
    private List<PhoneNumber> phoneNumberList = new ArrayList<>();

    public static PhoneBook phoneBook = null;

    public static PhoneBook getInstanceof() {
        if(phoneBook == null)
            phoneBook = new PhoneBook();
        return phoneBook;
    }

    private PhoneBook() {
    }

    public static void showMenu() {
        System.out.println("---------------MENU-----------\n" +
                "1. Add phone number.\n" +
                "2. Search by ma vung.\n" +
                "3. Show all.\n" +
                "4. Sum by ma vung.\n" +
                "5. Search by end of phone number.\n");
    }

    public void add() {
        Scanner scanner = new Scanner(System.in);
        int choose = 1;

        do {
            System.out.print("1. Add Phone number.\n" +
                    "2. Add International phone number.\n" +
                    "0. Exit.\n" +
                    "Choose: ");
            choose = Integer.parseInt(scanner.nextLine());

            switch (choose) {
                case 0:
                    break;
                case 1:
                    PhoneNumber phoneNumber = new PhoneNumber();
                    phoneNumber.input();
                    phoneNumberList.add(phoneNumber);
                    break;
                case 2:
                    IntlPhoneNumber intlPhoneNumber = new IntlPhoneNumber();
                    intlPhoneNumber.input();
                    phoneNumberList.add(intlPhoneNumber);
                    break;
                default:
                    System.out.println("Choose again.");
            }
        } while (choose != 0);
    }

    public void searchByMaVung() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ma vung");
        String maVung = scanner.nextLine();
        phoneNumberList.forEach(phoneNumber -> {
            if(phoneNumber.getMaVung().equals(maVung))
                System.out.println(phoneNumber);
        });
    }

    public void showAll() {
        Scanner scanner = new Scanner(System.in);
        int choose = 1;

        do {
            System.out.print("1. Show all home phone number.\n" +
                    "2. Show all international phone number.\n" +
                    "3. Show all both.\n" +
                    "0. Exit.\n" +
                    "Choose: ");

            choose = Integer.parseInt(scanner.nextLine());

            switch (choose) {
                case 0:
                    break;
                case 1:
                    System.out.println("List home phone number: ");
                    phoneNumberList.forEach(phoneNumber -> {
                        if(!(phoneNumber instanceof IntlPhoneNumber))
                            System.out.println(phoneNumber);
                    });
                    break;
                case 2:
                    System.out.println("List international phone number: ");
                    phoneNumberList.forEach(phoneNumber -> {
                        if((phoneNumber instanceof IntlPhoneNumber))
                            System.out.println(phoneNumber);

                    });
                    break;
                case 3:
                    System.out.println("List phone number: ");
                    phoneNumberList.forEach(phoneNumber -> {
                        System.out.println(phoneNumber);
                    });
                    break;
                default:
                    System.out.println("Choose again.");
            }
        } while (choose != 0);
    }

    public void sumByMaVung() {
        Map<String, Integer> map = new TreeMap<>();
        phoneNumberList.forEach(phoneNumber -> {
            if(!map.containsKey(phoneNumber.getMaVung()))
                map.put(phoneNumber.getMaVung(), 1);
            else
                map.replace(phoneNumber.getMaVung(), map.get(phoneNumber.getMaVung()) + 1);
        });

        for (String s : map.keySet()) {
            System.out.println("Ma vung " + s + ": " + map.get(s));
        }
    }

    public void searchEndWith() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input end of phone number: ");
        String temp = scanner.nextLine();
        for (PhoneNumber phoneNumber : phoneNumberList) {
            if(phoneNumber.toString().endsWith(temp))
                System.out.println(phoneNumber);
        }
    }
}
