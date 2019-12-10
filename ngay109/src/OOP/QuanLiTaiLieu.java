/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


/**
 *
 * @author User
 */
public class QuanLiTaiLieu {
    private ArrayList<TaiLieu> list;
    private Scanner in = new Scanner(System.in);
    public QuanLiTaiLieu() {//contructor
        list = new ArrayList<>();
    }
    

    
    public void nhapSach(){
        String tenSach;
        String tenTg;
        int soTrang;
        int soBan;
        String maTaiLieu;
        String tenNxb;
        
        while(true){
            System.out.println("moi ban nhap ma tai lieu ");
            maTaiLieu = in.nextLine();
            if(maTaiLieu.matches("^[A-Za-z]{1}\\d{2}[A-Za-z]{2}\\d{1}$"))
                break;
            else
                System.out.println("nhập lại mã : ");
        }
        
        System.out.println("nhap ten sach :");
        tenSach = in.nextLine();
        System.out.println("nhap ten ten tac gia :");
        tenTg = in.nextLine();
        System.out.println("nhap ten nha xuat ban :");
        tenNxb = in.nextLine();
        System.out.println("nhap so trang :");
        soTrang = Integer.parseInt(in.nextLine());
        System.out.println("nhap so ban : ");
        soBan = Integer.parseInt(in.nextLine());
        
        Sach sach = new Sach(tenSach, tenTg, soTrang, maTaiLieu, tenNxb, soBan);
        list.add(sach); //thêm vô list
    }
    
    public void nhapTapChi(){
        String maPhatHanh;
        int thangPhatHanh;
        int soBan;
        String maTaiLieu;
        String tenNxb;
        
        while(true){
            System.out.println("moi ban nhap ma tai lieu ");
            maTaiLieu = in.nextLine();
            if(maTaiLieu.matches("^[A-Za-z]{1}\\d{2}[A-Za-z]{2}\\d{1}$"))
                break;
            else
                System.out.println("nhap lai ma ");
        }
        System.out.println("nhap ma phat hanh");
        maPhatHanh = in.nextLine();
        System.out.println("nhap ten nxb");
        tenNxb = in.nextLine();
        System.out.println("nhap thang phat hanh");
        thangPhatHanh = Integer.parseInt(in.nextLine());
        System.out.println("nhap so ban");
        soBan = Integer.parseInt(in.nextLine());
        
        TapChi tapChi = new TapChi(maPhatHanh, thangPhatHanh, maTaiLieu, tenNxb, soBan);
        list.add(tapChi);
    }
    
    public void suaTaiLieu(){
        System.out.println("nhap ma tai lieu can sua tên nhà xuất bản");
        String maTaiLieu = in.nextLine();
        //sửa tên nhà xuất banrl 
        for (TaiLieu taiLieu : list) {
            if(taiLieu.getMaTaiLieu().equalsIgnoreCase(maTaiLieu)){
                System.out.println("nhập tên nxb");
                String tenNxb = in.nextLine();
                taiLieu.setTenNxb(tenNxb);
                System.out.println("sua thanh cong");
                break;
            }
        }
                
    }
    public void xoaTaiLieu(){
        System.out.println("nhap ma tai lieu cua tai lieu can xoa");
        String maTaiLieu = in.nextLine();
        for (TaiLieu taiLieu : list) {
            if(taiLieu.getMaTaiLieu().matches(maTaiLieu)){
                list.remove(taiLieu);
                System.out.println("xoa thanh cong");
                return;
            }
            
        }System.out.println("ko tim thay");
    }
    
    public void thongKe(){
        int slSach = 0 , slTapChi = 0;
        System.out.println("so luong tai lieu" + list.size());
        for (TaiLieu taiLieu : list) {
            System.out.println(taiLieu.toString());
            if(taiLieu instanceof Sach)
                slSach++;
            if(taiLieu instanceof TapChi)
                slTapChi++;
        }
        System.out.println("so luong tap chi " + slTapChi);
        System.out.println("so luong sach " + slSach);
    }
    
    public void timKiem(){
        System.out.println("nhap ma tai liêu can tim ");
        String maTaiLieu = in.nextLine();
        for (TaiLieu taiLieu : list) {
            if(taiLieu.getMaTaiLieu().equalsIgnoreCase(maTaiLieu))
                System.out.println("tai lieu can tim la " + taiLieu);
            return ;
        }
        System.out.println("ko tim thay ");
    }
    
    public void sortBysoBan(){   // sắp xếp theo số bản tăng dần 
        Collections.sort(list, (o1, o2) -> {
            if(o1.getSoBan() > o2.getSoBan()) 
                return 1;
            if(o1.getSoBan() < o2.getSoBan())
                return -1;
             return 0;
        } );
        for (TaiLieu taiLieu : list) {
            System.out.println(taiLieu.toString());
        }
    }
    
    public void sortBytenNxb(){
        Collections.sort(list, (o1, o2) -> {
            return o1.getTenNxb().compareToIgnoreCase(o2.getTenNxb()); // sắp xếp theo tên nxb tu A - Z ko phan biet dau;
        });
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).toString());
        }
    }
    
    public double tinhTongAnPham(){
        int sum = 0;
        for (TaiLieu taiLieu : list) {
            sum += taiLieu.tinhAnPham();
        }
        return sum;
    }
    
    public void sortByMaTaiLieu(){
        Collections.sort(list, new Comparator<TaiLieu>() {
            @Override
            public int compare(TaiLieu o1, TaiLieu o2) {
                return o1.getMaTaiLieu().compareToIgnoreCase(o1.getMaTaiLieu());
            }
            });
        }


}
