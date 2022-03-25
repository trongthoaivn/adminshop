package project.adminshop.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import project.adminshop.Entity.NguoiDung;
import project.adminshop.Services.NguoiDungService;

public interface NguoiDungRepository extends JpaRepository<NguoiDung, Long> {

    @Query("select n from NguoiDung n where n.email = ?1")
    NguoiDung findByEmail(String email);
}