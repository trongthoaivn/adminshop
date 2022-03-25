package project.adminshop.Model;

import java.io.Serializable;
import java.util.Objects;

public class NguoiDungDto implements Serializable {
    private Long id;
    private VaiTroDto maVaiTro;
    private String diaChi;
    private String email;
    private String hoTen;
    private String password;
    private String soDienThoai;

    public NguoiDungDto() {
    }

    public NguoiDungDto(Long id, VaiTroDto maVaiTro, String diaChi, String email, String hoTen, String password, String soDienThoai) {
        this.id = id;
        this.maVaiTro = maVaiTro;
        this.diaChi = diaChi;
        this.email = email;
        this.hoTen = hoTen;
        this.password = password;
        this.soDienThoai = soDienThoai;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public VaiTroDto getMaVaiTro() {
        return maVaiTro;
    }

    public void setMaVaiTro(VaiTroDto maVaiTro) {
        this.maVaiTro = maVaiTro;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NguoiDungDto entity = (NguoiDungDto) o;
        return Objects.equals(this.id, entity.id) &&
                Objects.equals(this.maVaiTro, entity.maVaiTro) &&
                Objects.equals(this.diaChi, entity.diaChi) &&
                Objects.equals(this.email, entity.email) &&
                Objects.equals(this.hoTen, entity.hoTen) &&
                Objects.equals(this.password, entity.password) &&
                Objects.equals(this.soDienThoai, entity.soDienThoai);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, maVaiTro, diaChi, email, hoTen, password, soDienThoai);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "id = " + id + ", " +
                "maVaiTro = " + maVaiTro + ", " +
                "diaChi = " + diaChi + ", " +
                "email = " + email + ", " +
                "hoTen = " + hoTen + ", " +
                "password = " + password + ", " +
                "soDienThoai = " + soDienThoai + ")";
    }
}
