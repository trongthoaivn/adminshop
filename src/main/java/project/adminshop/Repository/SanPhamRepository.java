package project.adminshop.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import project.adminshop.Entity.SanPham;

import java.util.List;

public interface SanPhamRepository extends JpaRepository<SanPham, Long> {
    @Query("select s from SanPham s where s.tenSanPham like %?1% and s.maDanhMuc.tenDanhMuc like %?1% and s.maHangSx.tenHangSanXuat like %?1%")
    List<SanPham> findByTenSanPham(String tenSanPham);
    @Query("select s from SanPham s where s.maDanhMuc.id = ?1")
    List<SanPham> findAllByDanhMucId(Long id);
    @Query("select s from SanPham s where s.maDanhMuc.id = ?1")
    List<SanPham> findAllByIdBrand(Long id);
}