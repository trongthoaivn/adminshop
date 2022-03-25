package project.adminshop.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import project.adminshop.Entity.DonHang;

import java.time.Instant;
import java.util.List;

public interface DonHangRepository extends JpaRepository<DonHang, Long> {
    @Query("select d from DonHang d where d.maNguoiDat.id = ?1")
    List<DonHang> findByUserId(Long id);

    @Query("select d from DonHang d where d.maNguoiDat.id = ?1 and d.trangThaiDonHang = ?2")
    List<DonHang> findByUseIdAndStatus(Long id, String status);


    @Query("select d from DonHang d where d.trangThaiDonHang = ?1")
    List<DonHang> findByStatus(String status);
    @Query("select d from DonHang d where d.ngayDatHang >= ?1 and d.ngayDatHang <= ?2")
    List<DonHang> findByTime(String startTime, String endTime);

    @Query(nativeQuery = true, value ="SELECT * FROM don_hang d WHERE d.ma_nguoi_dat = ?1 ORDER BY d.ngay_dat_hang DESC LIMIT 1 ")
    DonHang findByUserIdLastest(Long id);

    @Query(nativeQuery = true, value ="SELECT * FROM don_hang d ORDER BY d.ngay_dat_hang DESC ")
    List<DonHang> findAllDesc();
}