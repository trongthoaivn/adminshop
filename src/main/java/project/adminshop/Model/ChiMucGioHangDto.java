package project.adminshop.Model;

import java.io.Serializable;
import java.util.Objects;

public class ChiMucGioHangDto implements Serializable {
    private Long id;
    private Integer soLuong;
    private GioHangDto maGioHang;
    private SanPhamDto maSanPham;

    public ChiMucGioHangDto() {
    }

    public ChiMucGioHangDto(Long id, Integer soLuong, GioHangDto maGioHang, SanPhamDto maSanPham) {
        this.id = id;
        this.soLuong = soLuong;
        this.maGioHang = maGioHang;
        this.maSanPham = maSanPham;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(Integer soLuong) {
        this.soLuong = soLuong;
    }

    public GioHangDto getMaGioHang() {
        return maGioHang;
    }

    public void setMaGioHang(GioHangDto maGioHang) {
        this.maGioHang = maGioHang;
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
        ChiMucGioHangDto entity = (ChiMucGioHangDto) o;
        return Objects.equals(this.id, entity.id) &&
                Objects.equals(this.soLuong, entity.soLuong) &&
                Objects.equals(this.maGioHang, entity.maGioHang) &&
                Objects.equals(this.maSanPham, entity.maSanPham);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, soLuong, maGioHang, maSanPham);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "id = " + id + ", " +
                "soLuong = " + soLuong + ", " +
                "maGioHang = " + maGioHang + ", " +
                "maSanPham = " + maSanPham + ")";
    }
}
