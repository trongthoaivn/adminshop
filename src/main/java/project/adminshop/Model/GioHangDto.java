package project.adminshop.Model;

import java.io.Serializable;
import java.util.Objects;

public class GioHangDto implements Serializable {
    private Long id;
    private String tongTien;
    private NguoiDungDto maNguoiDung;

    public GioHangDto() {
    }

    public GioHangDto(Long id, String tongTien, NguoiDungDto maNguoiDung) {
        this.id = id;
        this.tongTien = tongTien;
        this.maNguoiDung = maNguoiDung;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTongTien() {
        return tongTien;
    }

    public void setTongTien(String tongTien) {
        this.tongTien = tongTien;
    }

    public NguoiDungDto getMaNguoiDung() {
        return maNguoiDung;
    }

    public void setMaNguoiDung(NguoiDungDto maNguoiDung) {
        this.maNguoiDung = maNguoiDung;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GioHangDto entity = (GioHangDto) o;
        return Objects.equals(this.id, entity.id) &&
                Objects.equals(this.tongTien, entity.tongTien) &&
                Objects.equals(this.maNguoiDung, entity.maNguoiDung);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, tongTien, maNguoiDung);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "id = " + id + ", " +
                "tongTien = " + tongTien + ", " +
                "maNguoiDung = " + maNguoiDung + ")";
    }
}
