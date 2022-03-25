package project.adminshop.Entity;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "nguoi_dung")
public class NguoiDung {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ma_vai_tro")
    private VaiTro maVaiTro;

    @Column(name = "dia_chi")
    private String diaChi;

    @Column(name = "email")
    private String email;

    @Column(name = "ho_ten")
    private String hoTen;

    @Column(name = "password")
    private String password;

    @Column(name = "so_dien_thoai")
    private String soDienThoai;

    @OneToMany(mappedBy = "maNguoiDung")
    private Set<NhanXet> nhanXets = new LinkedHashSet<>();

    @OneToMany(mappedBy = "maNguoiDung")
    private Set<GioHang> gioHangs = new LinkedHashSet<>();

    @OneToMany(mappedBy = "maNguoiTraLoi")
    private Set<LienHe> lienHes = new LinkedHashSet<>();

    @OneToMany(mappedBy = "maNguoiDat")
    private Set<DonHang> donHangs = new LinkedHashSet<>();

    public Set<DonHang> getDonHangs() {
        return donHangs;
    }

    public void setDonHangs(Set<DonHang> donHangs) {
        this.donHangs = donHangs;
    }

    public Set<LienHe> getLienHes() {
        return lienHes;
    }

    public void setLienHes(Set<LienHe> lienHes) {
        this.lienHes = lienHes;
    }

    public Set<GioHang> getGioHangs() {
        return gioHangs;
    }

    public void setGioHangs(Set<GioHang> gioHangs) {
        this.gioHangs = gioHangs;
    }

    public Set<NhanXet> getNhanXets() {
        return nhanXets;
    }

    public void setNhanXets(Set<NhanXet> nhanXets) {
        this.nhanXets = nhanXets;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public VaiTro getMaVaiTro() {
        return maVaiTro;
    }

    public void setMaVaiTro(VaiTro maVaiTro) {
        this.maVaiTro = maVaiTro;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}