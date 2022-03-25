package project.adminshop.Entity;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "lien_he")
public class LienHe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ma_nguoi_tra_loi")
    private NguoiDung maNguoiTraLoi;

    @Column(name = "email_lien_he")
    private String emailLienHe;

    @Column(name = "ngay_lien_he")
    private Instant ngayLienHe;

    @Column(name = "ngay_tra_loi")
    private Instant ngayTraLoi;

    @Column(name = "noi_dung_lien_he")
    private String noiDungLienHe;

    @Column(name = "noi_dung_tra_loi")
    private String noiDungTraLoi;

    @Column(name = "trang_thai")
    private String trangThai;

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public String getNoiDungTraLoi() {
        return noiDungTraLoi;
    }

    public void setNoiDungTraLoi(String noiDungTraLoi) {
        this.noiDungTraLoi = noiDungTraLoi;
    }

    public String getNoiDungLienHe() {
        return noiDungLienHe;
    }

    public void setNoiDungLienHe(String noiDungLienHe) {
        this.noiDungLienHe = noiDungLienHe;
    }

    public Instant getNgayTraLoi() {
        return ngayTraLoi;
    }

    public void setNgayTraLoi(Instant ngayTraLoi) {
        this.ngayTraLoi = ngayTraLoi;
    }

    public Instant getNgayLienHe() {
        return ngayLienHe;
    }

    public void setNgayLienHe(Instant ngayLienHe) {
        this.ngayLienHe = ngayLienHe;
    }

    public String getEmailLienHe() {
        return emailLienHe;
    }

    public void setEmailLienHe(String emailLienHe) {
        this.emailLienHe = emailLienHe;
    }

    public NguoiDung getMaNguoiTraLoi() {
        return maNguoiTraLoi;
    }

    public void setMaNguoiTraLoi(NguoiDung maNguoiTraLoi) {
        this.maNguoiTraLoi = maNguoiTraLoi;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}