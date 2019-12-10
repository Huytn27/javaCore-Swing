package ex1;

import java.util.Scanner;

public class PhoneNumber {
    private String maVung;
    private String noiVung;

    public PhoneNumber() {
    }

    public PhoneNumber(String maVung, String noiVung) {
        this.maVung = maVung;
        this.noiVung = noiVung;
    }

    public String getMaVung() {
        return maVung;
    }

    public void setMaVung(String maVung) {
        this.maVung = maVung;
    }

    public String getNoiVung() {
        return noiVung;
    }

    public void setNoiVung(String noiVung) {
        this.noiVung = noiVung;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Ma vung: ");
            maVung = scanner.nextLine();
            if(String.valueOf(maVung).matches("\\d{3,4}"))
                    break;
        } while(true);
        System.out.print("Noi vung: ");
        noiVung = scanner.nextLine();
    }

    @Override
    public String toString() {
        return maVung + "-" + noiVung;
    }
}
