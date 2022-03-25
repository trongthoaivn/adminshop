package project.adminshop.Model;

import java.io.Serializable;
import java.util.Objects;

public class SanPhamDto implements Serializable {
    private Long id;
    private DanhMucDto maDanhMuc;
    private HangSanXuatDto maHangSx;
    private String cpu;
    private Long donGia;
    private Integer donViBan;
    private Integer donViKho;
    private String dungLuongPin;
    private String heDieuHanh;
    private String manHinh;
    private String ram;
    private String tenSanPham;
    private String thietKe;
    private String thongTinBaoHanh;
    private String thongTinChung;
    private String moTa;
    private String hinhAnh;

    public SanPhamDto() {
    }

    public SanPhamDto(Long id, DanhMucDto maDanhMuc, HangSanXuatDto maHangSx, String cpu, Long donGia, Integer donViBan, Integer donViKho, String dungLuongPin, String heDieuHanh, String manHinh, String ram, String tenSanPham, String thietKe, String thongTinBaoHanh, String thongTinChung, String moTa, String hinhAnh) {
        this.id = id;
        this.maDanhMuc = maDanhMuc;
        this.maHangSx = maHangSx;
        this.cpu = cpu;
        this.donGia = donGia;
        this.donViBan = donViBan;
        this.donViKho = donViKho;
        this.dungLuongPin = dungLuongPin;
        this.heDieuHanh = heDieuHanh;
        this.manHinh = manHinh;
        this.ram = ram;
        this.tenSanPham = tenSanPham;
        this.thietKe = thietKe;
        this.thongTinBaoHanh = thongTinBaoHanh;
        this.thongTinChung = thongTinChung;
        this.moTa = moTa;
        this.hinhAnh = hinhAnh;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public DanhMucDto getMaDanhMuc() {
        return maDanhMuc;
    }

    public void setMaDanhMuc(DanhMucDto maDanhMuc) {
        this.maDanhMuc = maDanhMuc;
    }

    public HangSanXuatDto getMaHangSx() {
        return maHangSx;
    }

    public void setMaHangSx(HangSanXuatDto maHangSx) {
        this.maHangSx = maHangSx;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public Long getDonGia() {
        return donGia;
    }

    public void setDonGia(Long donGia) {
        this.donGia = donGia;
    }

    public Integer getDonViBan() {
        return donViBan;
    }

    public void setDonViBan(Integer donViBan) {
        this.donViBan = donViBan;
    }

    public Integer getDonViKho() {
        return donViKho;
    }

    public void setDonViKho(Integer donViKho) {
        this.donViKho = donViKho;
    }

    public String getDungLuongPin() {
        return dungLuongPin;
    }

    public void setDungLuongPin(String dungLuongPin) {
        this.dungLuongPin = dungLuongPin;
    }

    public String getHeDieuHanh() {
        return heDieuHanh;
    }

    public void setHeDieuHanh(String heDieuHanh) {
        this.heDieuHanh = heDieuHanh;
    }

    public String getManHinh() {
        return manHinh;
    }

    public void setManHinh(String manHinh) {
        this.manHinh = manHinh;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public String getThietKe() {
        return thietKe;
    }

    public void setThietKe(String thietKe) {
        this.thietKe = thietKe;
    }

    public String getThongTinBaoHanh() {
        return thongTinBaoHanh;
    }

    public void setThongTinBaoHanh(String thongTinBaoHanh) {
        this.thongTinBaoHanh = thongTinBaoHanh;
    }

    public String getThongTinChung() {
        return thongTinChung;
    }

    public void setThongTinChung(String thongTinChung) {
        this.thongTinChung = thongTinChung;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public String getHinhAnh() {
        return hinhAnh;
    }

    public void setHinhAnh(String hinhAnh) {
        this.hinhAnh = hinhAnh;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SanPhamDto entity = (SanPhamDto) o;
        return Objects.equals(this.id, entity.id) &&
                Objects.equals(this.maDanhMuc, entity.maDanhMuc) &&
                Objects.equals(this.maHangSx, entity.maHangSx) &&
                Objects.equals(this.cpu, entity.cpu) &&
                Objects.equals(this.donGia, entity.donGia) &&
                Objects.equals(this.donViBan, entity.donViBan) &&
                Objects.equals(this.donViKho, entity.donViKho) &&
                Objects.equals(this.dungLuongPin, entity.dungLuongPin) &&
                Objects.equals(this.heDieuHanh, entity.heDieuHanh) &&
                Objects.equals(this.manHinh, entity.manHinh) &&
                Objects.equals(this.ram, entity.ram) &&
                Objects.equals(this.tenSanPham, entity.tenSanPham) &&
                Objects.equals(this.thietKe, entity.thietKe) &&
                Objects.equals(this.thongTinBaoHanh, entity.thongTinBaoHanh) &&
                Objects.equals(this.thongTinChung, entity.thongTinChung) &&
                Objects.equals(this.moTa, entity.moTa) &&
                Objects.equals(this.hinhAnh, entity.hinhAnh);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, maDanhMuc, maHangSx, cpu, donGia, donViBan, donViKho, dungLuongPin, heDieuHanh, manHinh, ram, tenSanPham, thietKe, thongTinBaoHanh, thongTinChung, moTa, hinhAnh);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "id = " + id + ", " +
                "maDanhMuc = " + maDanhMuc + ", " +
                "maHangSx = " + maHangSx + ", " +
                "cpu = " + cpu + ", " +
                "donGia = " + donGia + ", " +
                "donViBan = " + donViBan + ", " +
                "donViKho = " + donViKho + ", " +
                "dungLuongPin = " + dungLuongPin + ", " +
                "heDieuHanh = " + heDieuHanh + ", " +
                "manHinh = " + manHinh + ", " +
                "ram = " + ram + ", " +
                "tenSanPham = " + tenSanPham + ", " +
                "thietKe = " + thietKe + ", " +
                "thongTinBaoHanh = " + thongTinBaoHanh + ", " +
                "thongTinChung = " + thongTinChung + ", " +
                "moTa = " + moTa + ", " +
                "hinhAnh = " + hinhAnh + ")";
    }
}
