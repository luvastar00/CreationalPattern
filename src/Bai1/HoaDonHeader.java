
package Bai1;

import java.time.LocalDate;

/**
 *
 * @author GIGABYTE
 */
public class HoaDonHeader {
    
    String maHoaDon, tenKhachHang;
    LocalDate ngayBan;

    public HoaDonHeader() {
    }

    public HoaDonHeader(String maHoaDon, String tenKhachHang, LocalDate ngayBan) {
        this.maHoaDon = maHoaDon;
        this.tenKhachHang = tenKhachHang;
        this.ngayBan = ngayBan;
    }
      public String getTenKhachHang() {
        return tenKhachHang;
    }

    public void setTenKhachHang(String tenKhachHang) {
        this.tenKhachHang = tenKhachHang;
    }

    public String getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(String maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public LocalDate getNgayBan() {
        return ngayBan;
    }

    public void setNgayBan(LocalDate ngayBan) {
        this.ngayBan = ngayBan;
    }
    
}
