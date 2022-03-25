package project.adminshop.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import project.adminshop.Entity.GioHang;

public interface GioHangRepository extends JpaRepository<GioHang, Long> {
}