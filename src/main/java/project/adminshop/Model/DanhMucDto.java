package project.adminshop.Model;

import java.io.Serializable;
import java.util.Objects;

public class DanhMucDto implements Serializable {
    private Long id;
    private String tenDanhMuc;

    public DanhMucDto() {
    }

    public DanhMucDto(Long id, String tenDanhMuc) {
        this.id = id;
        this.tenDanhMuc = tenDanhMuc;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTenDanhMuc() {
        return tenDanhMuc;
    }

    public void setTenDanhMuc(String tenDanhMuc) {
        this.tenDanhMuc = tenDanhMuc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DanhMucDto entity = (DanhMucDto) o;
        return Objects.equals(this.id, entity.id) &&
                Objects.equals(this.tenDanhMuc, entity.tenDanhMuc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, tenDanhMuc);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "id = " + id + ", " +
                "tenDanhMuc = " + tenDanhMuc + ")";
    }
}
