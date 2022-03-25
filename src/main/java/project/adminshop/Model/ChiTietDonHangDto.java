package project.adminshop.Model;

import java.io.Serializable;
import java.util.Objects;

public class ChiTietDonHangDto implements Serializable {
    private Long id;
    private Long donGia;
    private Integer soLuong;
    private DonHangDto maDonHang;
    private SanPhamDto maSanPham;

    public ChiTietDonHangDto() {
    }

    public ChiTietDonHangDto(Long id, Long donGia, Integer soLuong, DonHangDto maDonHang, SanPhamDto maSanPham) {
        this.id = id;
        this.donGia = donGia;
        this.soLuong = soLuong;
        this.maDonHang = maDonHang;
        this.maSanPham = maSanPham;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getDonGia() {
        return donGia;
    }

    public void setDonGia(Long donGia) {
        this.donGia = donGia;
    }

    public Integer getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(Integer soLuong) {
        this.soLuong = soLuong;
    }

    public DonHangDto getMaDonHang() {
        return maDonHang;
    }

    public void setMaDonHang(DonHangDto maDonHang) {
        this.maDonHang = maDonHang;
    }

    public SanPhamDto getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(SanPhamDto maSanPham) {
        this.maSanPham = maSanPham;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ChiTietDonHangDto entity = (ChiTietDonHangDto) o;
        return Objects.equals(this.id, entity.id) &&
                Objects.equals(this.donGia, entity.donGia) &&
                Objects.equals(this.soLuong, entity.soLuong) &&
                Objects.equals(this.maDonHang, entity.maDonHang) &&
                Objects.equals(this.maSanPham, entity.maSanPham);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, donGia, soLuong, maDonHang, maSanPham);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "id = " + id + ", " +
                "donGia = " + donGia + ", " +
                "soLuong = " + soLuong + ", " +
                "maDonHang = " + maDonHang + ", " +
                "maSanPham = " + maSanPham + ")";
    }
}
