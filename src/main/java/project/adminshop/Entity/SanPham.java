package project.adminshop.Entity;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "san_pham")
public class SanPham {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "cpu")
    private String cpu;

    @Column(name = "don_gia", nullable = false)
    private Long donGia;

    @Column(name = "don_vi_ban", nullable = false)
    private Integer donViBan;

    @Column(name = "don_vi_kho", nullable = false)
    private Integer donViKho;

    @Column(name = "dung_luong_pin")
    private String dungLuongPin;

    @Column(name = "he_dieu_hanh")
    private String heDieuHanh;

    @Column(name = "man_hinh")
    private String manHinh;

    @Column(name = "ram")
    private String ram;

    @Column(name = "ten_san_pham")
    private String tenSanPham;

    @Column(name = "thiet_ke")
    private String thietKe;

    @Column(name = "thong_tin_bao_hanh")
    private String thongTinBaoHanh;

    @Column(name = "thong_tin_chung")
    private String thongTinChung;

    @Lob
    @Column(name = "mo_ta")
    private String moTa;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ma_danh_muc")
    private DanhMuc maDanhMuc;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ma_hang_sx")
    private HangSanXuat maHangSx;

    @Column(name = "hinh_anh", length = 500)
    private String hinhAnh;

    @OneToMany(mappedBy = "maSanPham")
    private Set<NhanXet> nhanXets = new LinkedHashSet<>();

    @OneToMany(mappedBy = "maSanPham")
    private Set<ChiMucGioHang> chiMucGioHangs = new LinkedHashSet<>();

    @OneToMany(mappedBy = "maSanPham")
    private Set<ChiTietDonHang> chiTietDonHangs = new LinkedHashSet<>();

    public Set<ChiTietDonHang> getChiTietDonHangs() {
        return chiTietDonHangs;
    }

    public void setChiTietDonHangs(Set<ChiTietDonHang> chiTietDonHangs) {
        this.chiTietDonHangs = chiTietDonHangs;
    }

    public Set<ChiMucGioHang> getChiMucGioHangs() {
        return chiMucGioHangs;
    }

    public void setChiMucGioHangs(Set<ChiMucGioHang> chiMucGioHangs) {
        this.chiMucGioHangs = chiMucGioHangs;
    }

    public Set<NhanXet> getNhanXets() {
        return nhanXets;
    }

    public void setNhanXets(Set<NhanXet> nhanXets) {
        this.nhanXets = nhanXets;
    }

    public String getHinhAnh() {
        return hinhAnh;
    }

    public void setHinhAnh(String hinhAnh) {
        this.hinhAnh = hinhAnh;
    }

    public HangSanXuat getMaHangSx() {
        return maHangSx;
    }

    public void setMaHangSx(HangSanXuat maHangSx) {
        this.maHangSx = maHangSx;
    }

    public DanhMuc getMaDanhMuc() {
        return maDanhMuc;
    }

    public void setMaDanhMuc(DanhMuc maDanhMuc) {
        this.maDanhMuc = maDanhMuc;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public String getThongTinChung() {
        return thongTinChung;
    }

    public void setThongTinChung(String thongTinChung) {
        this.thongTinChung = thongTinChung;
    }

    public String getThongTinBaoHanh() {
        return thongTinBaoHanh;
    }

    public void setThongTinBaoHanh(String thongTinBaoHanh) {
        this.thongTinBaoHanh = thongTinBaoHanh;
    }

    public String getThietKe() {
        return thietKe;
    }

    public void setThietKe(String thietKe) {
        this.thietKe = thietKe;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getManHinh() {
        return manHinh;
    }

    public void setManHinh(String manHinh) {
        this.manHinh = manHinh;
    }

    public String getHeDieuHanh() {
        return heDieuHanh;
    }

    public void setHeDieuHanh(String heDieuHanh) {
        this.heDieuHanh = heDieuHanh;
    }

    public String getDungLuongPin() {
        return dungLuongPin;
    }

    public void setDungLuongPin(String dungLuongPin) {
        this.dungLuongPin = dungLuongPin;
    }

    public Integer getDonViKho() {
        return donViKho;
    }

    public void setDonViKho(Integer donViKho) {
        this.donViKho = donViKho;
    }

    public Integer getDonViBan() {
        return donViBan;
    }

    public void setDonViBan(Integer donViBan) {
        this.donViBan = donViBan;
    }

    public Long getDonGia() {
        return donGia;
    }

    public void setDonGia(Long donGia) {
        this.donGia = donGia;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}