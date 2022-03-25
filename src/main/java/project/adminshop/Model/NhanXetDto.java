package project.adminshop.Model;

import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;

public class NhanXetDto implements Serializable {
    private Long id;
    private NguoiDungDto maNguoiDung;
    private SanPhamDto maSanPham;
    private String binhLuan;
    private Integer diem;
    private Instant ngay;

    public NhanXetDto() {
    }

    public NhanXetDto(Long id, NguoiDungDto maNguoiDung, SanPhamDto maSanPham, String binhLuan, Integer diem, Instant ngay) {
        this.id = id;
        this.maNguoiDung = maNguoiDung;
        this.maSanPham = maSanPham;
        this.binhLuan = binhLuan;
        this.diem = diem;
        this.ngay = ngay;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public NguoiDungDto getMaNguoiDung() {
        return maNguoiDung;
    }

    public void setMaNguoiDung(NguoiDungDto maNguoiDung) {
        this.maNguoiDung = maNguoiDung;
    }

    public SanPhamDto getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(SanPhamDto maSanPham) {
        this.maSanPham = maSanPham;
    }

    public String getBinhLuan() {
        return binhLuan;
    }

    public void setBinhLuan(String binhLuan) {
        this.binhLuan = binhLuan;
    }

    public Integer getDiem() {
        return diem;
    }

    public void setDiem(Integer diem) {
        this.diem = diem;
    }

    public Instant getNgay() {
        return ngay;
    }

    public void setNgay(Instant ngay) {
        this.ngay = ngay;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NhanXetDto entity = (NhanXetDto) o;
        return Objects.equals(this.id, entity.id) &&
                Objects.equals(this.maNguoiDung, entity.maNguoiDung) &&
                Objects.equals(this.maSanPham, entity.maSanPham) &&
                Objects.equals(this.binhLuan, entity.binhLuan) &&
                Objects.equals(this.diem, entity.diem) &&
                Objects.equals(this.ngay, entity.ngay);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, maNguoiDung, maSanPham, binhLuan, diem, ngay);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "id = " + id + ", " +
                "maNguoiDung = " + maNguoiDung + ", " +
                "maSanPham = " + maSanPham + ", " +
                "binhLuan = " + binhLuan + ", " +
                "diem = " + diem + ", " +
                "ngay = " + ngay + ")";
    }
}
