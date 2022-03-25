package project.adminshop.Model;

import java.io.Serializable;
import java.util.Objects;

public class HangSanXuatDto implements Serializable {
    private Long id;
    private String tenHangSanXuat;

    public HangSanXuatDto() {
    }

    public HangSanXuatDto(Long id, String tenHangSanXuat) {
        this.id = id;
        this.tenHangSanXuat = tenHangSanXuat;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTenHangSanXuat() {
        return tenHangSanXuat;
    }

    public void setTenHangSanXuat(String tenHangSanXuat) {
        this.tenHangSanXuat = tenHangSanXuat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HangSanXuatDto entity = (HangSanXuatDto) o;
        return Objects.equals(this.id, entity.id) &&
                Objects.equals(this.tenHangSanXuat, entity.tenHangSanXuat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, tenHangSanXuat);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "id = " + id + ", " +
                "tenHangSanXuat = " + tenHangSanXuat + ")";
    }
}
