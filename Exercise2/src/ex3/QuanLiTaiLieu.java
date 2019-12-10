package ex3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class QuanLiTaiLieu {
    private ArrayList<TaiLieu> list;

    public QuanLiTaiLieu() {
        list = new ArrayList<>();
    }

    public static void showMenu() {
        System.out.print("-------------MENU-----------\n" +
                "1. Add.\n" +
                "2. Show.\n" +
                "3. Edit.\n" +
                "4. Delete.\n" +
                "5. Thong ke.\n" +
                "6. Xap sep theo ten nxb.\n" +
                "7. Xap sep theo so ban phat hanh.\n" +
                "Nhap lua chon: ");
    }

    private boolean tonTai(String id) {
        for (TaiLieu taiLieu : list) {
            if(taiLieu.getId().equalsIgnoreCase(id))
                return true;
        }
        return false;
    }

    private TaiLieu nhap() {
        Scanner scanner = new Scanner(System.in);
         String id;
         String tenNxb;
         int soBan;

        System.out.println("Nhap id: ");
        do {
            id = scanner.nextLine().toUpperCase();
            if(!tonTai(id) && id.matches("^[A-Z]{2}\\d{3}"))
                break;
            System.out.println("Nhap lai id: ");
        } while(true);
        System.out.println("Nhap ten NXB: ");
        tenNxb = scanner.nextLine();
        System.out.println("Nhap so ban: ");
        soBan = Integer.parseInt(scanner.nextLine());
        return new TaiLieu(id, tenNxb, soBan);
    }

    private void nhapSach() {
        Scanner scanner = new Scanner(System.in);
        TaiLieu taiLieu = nhap();
        System.out.println("Nhap tac gia: ");
         String tacGia = scanner.nextLine();
        System.out.println("Nhap ten: ");
         String ten = scanner.nextLine();
        System.out.println("Nhap so trang: ");
         int soTrang = Integer.parseInt(scanner.nextLine());
         list.add(new Sach(taiLieu.getId(), taiLieu.getTenNxb(), taiLieu.getSoBan(), tacGia, ten, soTrang));
    }

    private void nhapBao() throws ParseException {
        Scanner scanner = new Scanner(System.in);
        TaiLieu taiLieu = nhap();
        System.out.println("Nhap date: ");
        String date = scanner.nextLine();
        list.add(new Bao(taiLieu.getId(), taiLieu.getTenNxb(), taiLieu.getSoBan(),
                new SimpleDateFormat("dd/MM/yyy").parse(date)));
    }

    private void nhapTapChi() {
        Scanner scanner = new Scanner(System.in);
        TaiLieu taiLieu = nhap();
        System.out.println("Nhap so phat hanh: ");
        int soPhatHanh = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap so trang: ");
        int thangPhatHanh = Integer.parseInt(scanner.nextLine());
        list.add(new TapChi(taiLieu.getId(), taiLieu.getTenNxb(), taiLieu.getSoBan(), soPhatHanh, thangPhatHanh));
    }

    public void add() throws ParseException {
        Scanner scanner = new Scanner(System.in);
        int luaChon = 1;

        do {
            System.out.print("1. Nhap Sach.\n" +
                    "2. Nhap Tap chi.\n" +
                    "3. Nhap Bao.\n" +
                    "0. Thoat.\n" +
                    "Nhap lua chon: ");
            luaChon = Integer.parseInt(scanner.nextLine());

            switch (luaChon) {
                case 0:
                    break;
                case 1:
                    nhapSach();
                    break;
                case 2:
                    nhapTapChi();
                    break;
                case 3:
                    nhapBao();
                    break;
                default:
                    System.out.println("Vui long nhap lai.");
            }
        } while (luaChon != 0);
    }

    public void show() {
        int sum1 = 0;
        System.out.println("-------------Sach-----------");
        for (TaiLieu taiLieu : list) {
            if(taiLieu instanceof Sach) {
                System.out.println(taiLieu);
                sum1++;
            }
        }
        System.out.println("Sum = " + sum1);

        int sum2 = 0;
        System.out.println("-------------TapChi-----------");
        for (TaiLieu taiLieu : list) {
            if(taiLieu instanceof TapChi) {
                System.out.println(taiLieu);
                sum2++;
            }
        }
        System.out.println("Sum = " + sum2);

        int sum3 = 0;
        System.out.println("-------------Bao-----------");
        for (TaiLieu taiLieu : list) {
            if(taiLieu instanceof Bao) {
                System.out.println(taiLieu);
                sum3++;
            }
        }
        System.out.println("Sum = " + sum3);
    }

    public void delete() {
        String id;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap id: ");
        id = scanner.nextLine();

        for (TaiLieu taiLieu : list) {
            if(taiLieu.getId() == id) {
                list.remove(taiLieu);
                System.out.println("Xoa thanh congs");
            }
        }
    }

    public void edit() {
        String id;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap id: ");
        id = scanner.nextLine();
        for (TaiLieu taiLieu : list) {
            if(taiLieu.getId() == id) {
                System.out.println("Nhap ten NXB: ");
                String tenNxb = scanner.nextLine();
                System.out.println("Nhap so ban: ");
                int soBan = Integer.parseInt(scanner.nextLine());
                taiLieu.setTenNxb(tenNxb);
                taiLieu.setSoBan(soBan);
                System.out.println("Sua thanh cong");
                break;
            }
        }
    }

    public void thongKe() {
        Map<String, Integer> map = new TreeMap<>();
        for (TaiLieu taiLieu : list) {
            if(!map.containsKey(taiLieu.getTenNxb()))
                map.put(taiLieu.getTenNxb(), 1);
            else
                map.replace(taiLieu.getTenNxb(), map.get(taiLieu.getTenNxb()) + 1);
        }

        for (String s : map.keySet()) {
            System.out.println(s + ": " + map.get(s));
        }
    }

    public void sortByTenNxb() {
        Collections.sort(list, (taiLieu, t1) -> {
            return taiLieu.getTenNxb().compareTo(t1.getTenNxb());
        });
    }

    public void sortBySoBan() {
        Collections.sort(list, (taiLieu, t1) -> {
            if(taiLieu.getSoBan() < t1.getSoBan())
                return -1;
            if(taiLieu.getSoBan() > t1.getSoBan())
                return 1;
            return 0;
        });
    }

    public void sortBy2TT() { /// ma, soBan
        Collections.sort(list, (taiLieu, t1) -> {
            int temp = taiLieu.getId().compareToIgnoreCase(t1.getId());
            if(temp == 0)
                return t1.getSoBan() - taiLieu.getSoBan();
            return temp;
        });
    }

    // sap xep theo 2 thuoc tinh tro len


}
