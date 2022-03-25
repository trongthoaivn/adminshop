package project.adminshop.Model;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Objects;

public class DonHangDto implements Serializable {
    private Long id;
    private String diaChiNhan;
    private String ghiChu;
    private String hoTenNguoiNhan;
    private Instant ngayDatHang;
    private Instant ngayGiaoHang;
    private Instant ngayNhanHang;
    private String sdtNhanHang;
    private String trangThaiDonHang;
    private NguoiDungDto maNguoiDat;
    private Integer tongTien;

    public DonHangDto() {
    }

    public DonHangDto(Long id, String diaChiNhan, String ghiChu, String hoTenNguoiNhan, Instant ngayDatHang, Instant ngayGiaoHang, Instant ngayNhanHang, String sdtNhanHang, String trangThaiDonHang, NguoiDungDto maNguoiDat, Integer tongTien) {
        this.id = id;
        this.diaChiNhan = diaChiNhan;
        this.ghiChu = ghiChu;
        this.hoTenNguoiNhan = hoTenNguoiNhan;
        this.ngayDatHang = ngayDatHang;
        this.ngayGiaoHang = ngayGiaoHang;
        this.ngayNhanHang = ngayNhanHang;
        this.sdtNhanHang = sdtNhanHang;
        this.trangThaiDonHang = trangThaiDonHang;
        this.maNguoiDat = maNguoiDat;
        this.tongTien = tongTien;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDiaChiNhan() {
        return diaChiNhan;
    }

    public void setDiaChiNhan(String diaChiNhan) {
        this.diaChiNhan = diaChiNhan;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public String getHoTenNguoiNhan() {
        return hoTenNguoiNhan;
    }

    public void setHoTenNguoiNhan(String hoTenNguoiNhan) {
        this.hoTenNguoiNhan = hoTenNguoiNhan;
    }

    public Instant getNgayDatHang() {
        return ngayDatHang;
    }

    public void setNgayDatHang(Instant ngayDatHang) {
        this.ngayDatHang = ngayDatHang;
    }

    public Instant getNgayGiaoHang() {
        return ngayGiaoHang;
    }

    public void setNgayGiaoHang(Instant ngayGiaoHang) {
        this.ngayGiaoHang = ngayGiaoHang;
    }

    public Instant getNgayNhanHang() {
        return ngayNhanHang;
    }

    public void setNgayNhanHang(Instant ngayNhanHang) {
        this.ngayNhanHang = ngayNhanHang;
    }

    public String getSdtNhanHang() {
        return sdtNhanHang;
    }

    public void setSdtNhanHang(String sdtNhanHang) {
        this.sdtNhanHang = sdtNhanHang;
    }

    public String getTrangThaiDonHang() {
        return trangThaiDonHang;
    }

    public void setTrangThaiDonHang(String trangThaiDonHang) {
        this.trangThaiDonHang = trangThaiDonHang;
    }

    public NguoiDungDto getMaNguoiDat() {
        return maNguoiDat;
    }

    public void setMaNguoiDat(NguoiDungDto maNguoiDat) {
        this.maNguoiDat = maNguoiDat;
    }

    public Integer getTongTien() {
        return tongTien;
    }

    public void setTongTien(Integer tongTien) {
        this.tongTien = tongTien;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DonHangDto entity = (DonHangDto) o;
        return Objects.equals(this.id, entity.id) &&
                Objects.equals(this.diaChiNhan, entity.diaChiNhan) &&
                Objects.equals(this.ghiChu, entity.ghiChu) &&
                Objects.equals(this.hoTenNguoiNhan, entity.hoTenNguoiNhan) &&
                Objects.equals(this.ngayDatHang, entity.ngayDatHang) &&
                Objects.equals(this.ngayGiaoHang, entity.ngayGiaoHang) &&
                Objects.equals(this.ngayNhanHang, entity.ngayNhanHang) &&
                Objects.equals(this.sdtNhanHang, entity.sdtNhanHang) &&
                Objects.equals(this.trangThaiDonHang, entity.trangThaiDonHang) &&
                Objects.equals(this.maNguoiDat, entity.maNguoiDat) &&
                Objects.equals(this.tongTien, entity.tongTien);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, diaChiNhan, ghiChu, hoTenNguoiNhan, ngayDatHang, ngayGiaoHang, ngayNhanHang, sdtNhanHang, trangThaiDonHang, maNguoiDat, tongTien);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "id = " + id + ", " +
                "diaChiNhan = " + diaChiNhan + ", " +
                "ghiChu = " + ghiChu + ", " +
                "hoTenNguoiNhan = " + hoTenNguoiNhan + ", " +
                "ngayDatHang = " + ngayDatHang + ", " +
                "ngayGiaoHang = " + ngayGiaoHang + ", " +
                "ngayNhanHang = " + ngayNhanHang + ", " +
                "sdtNhanHang = " + sdtNhanHang + ", " +
                "trangThaiDonHang = " + trangThaiDonHang + ", " +
                "maNguoiDat = " + maNguoiDat + ", " +
                "tongTien = " + tongTien + ")";
    }
}
