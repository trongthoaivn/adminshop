package project.adminshop.Entity;

import javax.persistence.*;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "don_hang")
public class DonHang {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "dia_chi_nhan")
    private String diaChiNhan;

    @Column(name = "ghi_chu")
    private String ghiChu;

    @Column(name = "ho_ten_nguoi_nhan")
    private String hoTenNguoiNhan;

    @Column(name = "ngay_dat_hang")
    private Instant ngayDatHang;

    @Column(name = "ngay_giao_hang")
    private Instant ngayGiaoHang;

    @Column(name = "ngay_nhan_hang")
    private Instant ngayNhanHang;

    @Column(name = "sdt_nhan_hang")
    private String sdtNhanHang;

    @Column(name = "trang_thai_don_hang")
    private String trangThaiDonHang;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ma_nguoi_dat")
    private NguoiDung maNguoiDat;

    @Column(name = "tong_tien")
    private Integer tongTien;

    @OneToMany(mappedBy = "maDonHang")
    private Set<ChiTietDonHang> chiTietDonHangs = new LinkedHashSet<>();

    public Set<ChiTietDonHang> getChiTietDonHangs() {
        return chiTietDonHangs;
    }

    public void setChiTietDonHangs(Set<ChiTietDonHang> chiTietDonHangs) {
        this.chiTietDonHangs = chiTietDonHangs;
    }

    public Integer getTongTien() {
        return tongTien;
    }

    public void setTongTien(Integer tongTien) {
        this.tongTien = tongTien;
    }

    public NguoiDung getMaNguoiDat() {
        return maNguoiDat;
    }

    public void setMaNguoiDat(NguoiDung maNguoiDat) {
        this.maNguoiDat = maNguoiDat;
    }

    public String getTrangThaiDonHang() {
        return trangThaiDonHang;
    }

    public void setTrangThaiDonHang(String trangThaiDonHang) {
        this.trangThaiDonHang = trangThaiDonHang;
    }

    public String getSdtNhanHang() {
        return sdtNhanHang;
    }

    public void setSdtNhanHang(String sdtNhanHang) {
        this.sdtNhanHang = sdtNhanHang;
    }

    public Instant getNgayNhanHang() {
        return ngayNhanHang;
    }

    public void setNgayNhanHang(Instant ngayNhanHang) {
        this.ngayNhanHang = ngayNhanHang;
    }

    public Instant getNgayGiaoHang() {
        return ngayGiaoHang;
    }

    public void setNgayGiaoHang(Instant ngayGiaoHang) {
        this.ngayGiaoHang = ngayGiaoHang;
    }

    public Instant getNgayDatHang() {
        return ngayDatHang;
    }

    public void setNgayDatHang(Instant ngayDatHang) {
        this.ngayDatHang = ngayDatHang;
    }

    public String getHoTenNguoiNhan() {
        return hoTenNguoiNhan;
    }

    public void setHoTenNguoiNhan(String hoTenNguoiNhan) {
        this.hoTenNguoiNhan = hoTenNguoiNhan;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public String getDiaChiNhan() {
        return diaChiNhan;
    }

    public void setDiaChiNhan(String diaChiNhan) {
        this.diaChiNhan = diaChiNhan;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNgayDatHangString() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return sdf.format(this.ngayDatHang);
    }
}