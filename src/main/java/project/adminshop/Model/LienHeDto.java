package project.adminshop.Model;

import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;

public class LienHeDto implements Serializable {
    private Long id;
    private NguoiDungDto maNguoiTraLoi;
    private String emailLienHe;
    private Instant ngayLienHe;
    private Instant ngayTraLoi;
    private String noiDungLienHe;
    private String noiDungTraLoi;
    private String trangThai;

    public LienHeDto() {
    }

    public LienHeDto(Long id, NguoiDungDto maNguoiTraLoi, String emailLienHe, Instant ngayLienHe, Instant ngayTraLoi, String noiDungLienHe, String noiDungTraLoi, String trangThai) {
        this.id = id;
        this.maNguoiTraLoi = maNguoiTraLoi;
        this.emailLienHe = emailLienHe;
        this.ngayLienHe = ngayLienHe;
        this.ngayTraLoi = ngayTraLoi;
        this.noiDungLienHe = noiDungLienHe;
        this.noiDungTraLoi = noiDungTraLoi;
        this.trangThai = trangThai;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public NguoiDungDto getMaNguoiTraLoi() {
        return maNguoiTraLoi;
    }

    public void setMaNguoiTraLoi(NguoiDungDto maNguoiTraLoi) {
        this.maNguoiTraLoi = maNguoiTraLoi;
    }

    public String getEmailLienHe() {
        return emailLienHe;
    }

    public void setEmailLienHe(String emailLienHe) {
        this.emailLienHe = emailLienHe;
    }

    public Instant getNgayLienHe() {
        return ngayLienHe;
    }

    public void setNgayLienHe(Instant ngayLienHe) {
        this.ngayLienHe = ngayLienHe;
    }

    public Instant getNgayTraLoi() {
        return ngayTraLoi;
    }

    public void setNgayTraLoi(Instant ngayTraLoi) {
        this.ngayTraLoi = ngayTraLoi;
    }

    public String getNoiDungLienHe() {
        return noiDungLienHe;
    }

    public void setNoiDungLienHe(String noiDungLienHe) {
        this.noiDungLienHe = noiDungLienHe;
    }

    public String getNoiDungTraLoi() {
        return noiDungTraLoi;
    }

    public void setNoiDungTraLoi(String noiDungTraLoi) {
        this.noiDungTraLoi = noiDungTraLoi;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LienHeDto entity = (LienHeDto) o;
        return Objects.equals(this.id, entity.id) &&
                Objects.equals(this.maNguoiTraLoi, entity.maNguoiTraLoi) &&
                Objects.equals(this.emailLienHe, entity.emailLienHe) &&
                Objects.equals(this.ngayLienHe, entity.ngayLienHe) &&
                Objects.equals(this.ngayTraLoi, entity.ngayTraLoi) &&
                Objects.equals(this.noiDungLienHe, entity.noiDungLienHe) &&
                Objects.equals(this.noiDungTraLoi, entity.noiDungTraLoi) &&
                Objects.equals(this.trangThai, entity.trangThai);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, maNguoiTraLoi, emailLienHe, ngayLienHe, ngayTraLoi, noiDungLienHe, noiDungTraLoi, trangThai);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "id = " + id + ", " +
                "maNguoiTraLoi = " + maNguoiTraLoi + ", " +
                "emailLienHe = " + emailLienHe + ", " +
                "ngayLienHe = " + ngayLienHe + ", " +
                "ngayTraLoi = " + ngayTraLoi + ", " +
                "noiDungLienHe = " + noiDungLienHe + ", " +
                "noiDungTraLoi = " + noiDungTraLoi + ", " +
                "trangThai = " + trangThai + ")";
    }
}
