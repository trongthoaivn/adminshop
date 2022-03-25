package project.adminshop.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import project.adminshop.Entity.ChiTietDonHang;

import java.util.List;

public interface ChiTietDonHangRepository extends JpaRepository<ChiTietDonHang, Long> {


    @Query("select ct from ChiTietDonHang ct where ct.maDonHang.id = ?1")
    List<ChiTietDonHang> findByDonHangId(Long id);

    @Modifying
    @Query(nativeQuery = true , value = "DELETE FROM chi_tiet_don_hang  WHERE chi_tiet_don_hang.ma_don_hang = ?1")
    void deleteAllByDonHangId(Long id);
}