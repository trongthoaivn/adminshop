package project.adminshop.Entity;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "gio_hang")
public class GioHang {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "tong_tien")
    private String tongTien;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ma_nguoi_dung")
    private NguoiDung maNguoiDung;

    @OneToMany(mappedBy = "maGioHang")
    private Set<ChiMucGioHang> chiMucGioHangs = new LinkedHashSet<>();

    public Set<ChiMucGioHang> getChiMucGioHangs() {
        return chiMucGioHangs;
    }

    public void setChiMucGioHangs(Set<ChiMucGioHang> chiMucGioHangs) {
        this.chiMucGioHangs = chiMucGioHangs;
    }

    public NguoiDung getMaNguoiDung() {
        return maNguoiDung;
    }

    public void setMaNguoiDung(NguoiDung maNguoiDung) {
        this.maNguoiDung = maNguoiDung;
    }

    public String getTongTien() {
        return tongTien;
    }

    public void setTongTien(String tongTien) {
        this.tongTien = tongTien;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}