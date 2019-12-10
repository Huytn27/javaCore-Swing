package ex1;


import java.util.Scanner;

public class IntlPhoneNumber extends PhoneNumber {
    private String maQuocGia;

    public IntlPhoneNumber() {
    }

    public IntlPhoneNumber(String maQuocGia) {
        this.maQuocGia = maQuocGia;
    }

    public IntlPhoneNumber(String maVung, String noiVung, String maQuocGia) {
        super(maVung, noiVung);
        this.maQuocGia = maQuocGia;
    }

    public void setMaQuocGia(String maQuocGia) {
        this.maQuocGia = maQuocGia;
    }

    public String getMaQuocGia() {
        return maQuocGia;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ma quoc gia: ");
        maQuocGia = scanner.nextLine();
        do {
            System.out.print("Ma vung: ");
            super.setMaVung(scanner.nextLine());
            if(super.getMaVung().matches("\\d{3,4}"))
                break;
        } while(true);
        System.out.print("Noi vung: ");
        super.setNoiVung(scanner.nextLine());
    }

    @Override
    public String toString() {
        return maQuocGia + "-" + super.getMaVung() + "-" + super.getNoiVung();
    }

}
