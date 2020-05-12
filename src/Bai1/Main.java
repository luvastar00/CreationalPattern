/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai1;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author GIGABYTE
 */
public class Main {
    
    public static LocalDate getDateFromString(String string, DateTimeFormatter format) {       
        LocalDate date = LocalDate.parse(string, format);
        return date; 
    }  
    
    public static void main(String[] args) throws ParseException {
        
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy"); 
        
        HoaDon hoaDon = new HoaDon.Builder()
                .addHeader("HD01", "Nguyen Van A", getDateFromString("20/03/2020", format))
                .addProduct("GearGaming", 1, 2000000, 0.2F)
                .build();
     
        System.out.println("Hoa Don");
        System.out.println("Mã hóa đơn: " + hoaDon.header.getMaHoaDon() + "\n" +
                            "Tên khách hàng: " + hoaDon.header.getTenKhachHang() + "\n" +
                            "Ngày bán: " + hoaDon.header.getNgayBan() + "\n");
        
        System.out.println("Chi tiết hóa đơn");
        for (ChiTietHoaDon x : hoaDon.chiTietHD) {
            System.out.println("Tên sản phẩm: " + x.getTenSanPham() + "\n"
                                + "Số lượng: " + x.getSoLuong() + "\n"
                                + "Đơn giá: " + (int)x.getDonGia() + "\n"
                                + "Chiết khấu: " + x.getChietKhau() + "\n");
        }
    }
}