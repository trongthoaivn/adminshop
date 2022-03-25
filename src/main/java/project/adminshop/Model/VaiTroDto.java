package project.adminshop.Model;

import java.io.Serializable;
import java.util.Objects;

public class VaiTroDto implements Serializable {
    private Long id;
    private String tenVaiTro;

    public VaiTroDto() {
    }

    public VaiTroDto(Long id, String tenVaiTro) {
        this.id = id;
        this.tenVaiTro = tenVaiTro;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTenVaiTro() {
        return tenVaiTro;
    }

    public void setTenVaiTro(String tenVaiTro) {
        this.tenVaiTro = tenVaiTro;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VaiTroDto entity = (VaiTroDto) o;
        return Objects.equals(this.id, entity.id) &&
                Objects.equals(this.tenVaiTro, entity.tenVaiTro);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, tenVaiTro);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "id = " + id + ", " +
                "tenVaiTro = " + tenVaiTro + ")";
    }
}
