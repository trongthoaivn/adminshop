package project.adminshop.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import project.adminshop.Entity.DanhMuc;

public interface DanhMucRepository extends JpaRepository<DanhMuc, Long> {
}