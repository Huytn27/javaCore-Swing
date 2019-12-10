
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import quanlitailieu.Sach;
import quanlitailieu.TaiLieu;
import quanlitailieu.TapChi;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author User
 */
public class QuanLiTaiLieu {
    private List<TaiLieu> taiLieuList;
    Scanner input = new Scanner(System.in);
    public QuanLiTaiLieu(){
        taiLieuList = new ArrayList<>();
    }
    
    public static void showMenu() {
        System.out.println("__________Menu___________\n"
                + "1. add tai lieu\n"
                + "2. show all\n"
                + "3. xoa \n"
                + "4. sap xep theo so ban\n"
                + "5. sap xep theo ten nxb\n"
                + "6. choose:  ");
        
    }
    
    public void addTaiLieu(){
        
        int choose = 1;
        do {
            System.out.println("1. Nhap sach \n"
                    + "2.Nhap tap chi \n"
                    + "0. Thoat.\n"
                    + "choose: ");
            choose = Integer.parseInt(input.nextLine());//
            switch(choose){
                case 0:
                    break;
                case 1:
                    addSach();
                    break;
                case 2:
                    // addTapChi;
                    break;
                default:
                    System.out.println("nhap lai");
            }
        } while(choose != 0);
    }
    private void addSach() {
        String maTaiLieu;
        String tenNxb;
        int soBan;
        String tenSach;
        String tenTg;
        int soTrang;
        
        do{
          System.out.println("Ma Tai Lieu ");
          maTaiLieu = input.nextLine();
          if(maTaiLieu.matches("[a-zA-Z]{1}\\d{2}[a-zA-Z]{2}\\d{4}"))
              break;
        }while(true);
       
        System.out.println("Ten nha xuat ban ");
        tenNxb = input.nextLine();
        System.out.println("so Ban ");
        soBan = Integer.parseInt(input.nextLine());
        System.out.println("ten Sach ");
        tenSach = input.nextLine();
        System.out.println("ten tac gia ");
        tenTg = input.nextLine();
        System.out.println("so trang ");
        soTrang = Integer.parseInt(input.nextLine());
        
        Sach sach = new Sach(tenSach, tenTg, soTrang, maTaiLieu, tenNxb, soBan);//khởi tạo sach 
        taiLieuList.add(sach);
    }
    
    
    public void showAll() {
        int slSach = 0;
        int slTapChi = 0;
        for (TaiLieu taiLieu : taiLieuList) {
            System.out.println(taiLieu.toString()); //in 
            if(taiLieu instanceof Sach)// neu tai lieu thuoc kieu sach;
                slSach++;
            else if(taiLieu instanceof TapChi)
                slTapChi++;
        }
        System.out.println("SL tai lieu " + taiLieuList.size());// tong so tai lieu
        System.out.println("SL sach" + slSach);
        System.out.println("SL tap chi" + slTapChi);
        
        
    }
    
    public void removeTaiLieu(){
        System.out.println("Ma tai lieu can xoa ");
        String maTaiLieu = input.nextLine();
        for (TaiLieu taiLieu : taiLieuList) {
            if(taiLieu.getMaTaiLieu().equalsIgnoreCase(maTaiLieu)) {
                taiLieuList.remove(taiLieu);
                System.out.println("xoa thanh cong ");
                return ;
            } 
        }
        System.out.println("ko tim thay");
            
    }
    public void sortBysoBan(){   // sắp xếp theo số bản tăng dần 
        Collections.sort(taiLieuList, (o1, o2) -> {
            if(o1.getSoBan() > o2.getSoBan()) 
                return 1;
            if(o1.getSoBan() < o2.getSoBan())
                return -1;
             return 0;
        } );
    }
    public void sortBytenNxb(){
        Collections.sort(taiLieuList, (o1, o2) -> {
            return o1.getTenNxb().compareToIgnoreCase(o2.getTenNxb()); // sắp xếp theo tên nxb tu A - Z ko phan biet dau;
        });
    }
    public void edit() {
        System.out.println("nhap ma can sua ");
        String matailieu = input.nextLine();
        for (TaiLieu taiLieu : taiLieuList) {
            if(taiLieu.getMaTaiLieu().equalsIgnoreCase(matailieu)){
                System.out.println("ten nha xuat ban ");
                String tenNxb = input.nextLine();
                taiLieu.setTenNxb(tenNxb);
                System.out.println("sua thanh cong ");
                return ;
            }
        
                
            
        }
        System.out.println("ko tim thay ");
    }
    
    public void search() {
        System.out.println("nhap ma tai lieu ");
        String matailieu = input.nextLine();
        for (TaiLieu taiLieu : taiLieuList) {
            if(taiLieu.getMaTaiLieu().equalsIgnoreCase(matailieu)){
                System.out.println(taiLieu.toString());;
                return ;
            }
        
                
            
        }
        System.out.println("ko tim thay ");
    }
    
    
    
}
