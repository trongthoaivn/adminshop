package project.adminshop.Services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.adminshop.Entity.ChiTietDonHang;
import project.adminshop.Mapper.ChiTietDonHangMapper;
import project.adminshop.Mapper.DonHangMapper;
import project.adminshop.Model.ChiTietDonHangDto;
import project.adminshop.Model.DonHangDto;
import project.adminshop.Repository.ChiTietDonHangRepository;
import project.adminshop.Repository.DonHangRepository;

import java.time.Instant;
import java.util.List;

@Service
public class DonHangService {

    @Autowired
    private DonHangRepository donHangRepository;

    @Autowired
    private ChiTietDonHangRepository chiTietDonHangRepository;


    private DonHangMapper donHangMapper = new DonHangMapper();

    private ChiTietDonHangMapper chiTietDonHangMapper = new ChiTietDonHangMapper();

    public List<DonHangDto> getAllDonHang() {
        return donHangMapper.toDTOs(donHangRepository.findAllDesc());
    }


    public DonHangDto getDonHangById(Long id) {
        return donHangMapper.toDTO(donHangRepository.findById(id).get());
    }

    public List<DonHangDto> getDonHangByTime(String StartTime, String EndTime) {
        return donHangMapper.toDTOs(donHangRepository.findByTime( StartTime, EndTime));
    }

    public List<DonHangDto> getDonHangByUserId(Long id) {
        return donHangMapper.toDTOs(donHangRepository.findByUserId(id));
    }


    public List<DonHangDto> getDonHangByUserIdAndStatus(Long id, String status) {
        return donHangMapper.toDTOs(donHangRepository.findByUseIdAndStatus(id, status));
    }


    public List<DonHangDto> getDonHangByStatus(String status) {
        return donHangMapper.toDTOs(donHangRepository.findByStatus(status));
    }

    public List<ChiTietDonHangDto> getChiTietDonHangByDonHangId(Long id) {
        return chiTietDonHangMapper.toDTOs(chiTietDonHangRepository.findByDonHangId(id));
    }

    public ChiTietDonHangDto getChiTietDonHangById(Long id) {
        return chiTietDonHangMapper.toDTO(chiTietDonHangRepository.findById(id).get());
    }

    public Long lastetDonHangId(Long id) {
        return donHangRepository.findByUserIdLastest(id).getId();
    }

    public Boolean addDonHang(DonHangDto donHangDto) {
        try {
            donHangRepository.save(donHangMapper.toEntity(donHangDto));
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public Boolean updateDonHang(DonHangDto donHangDto) {
        try {
            donHangRepository.save(donHangMapper.toEntity(donHangDto));
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public Boolean deleteDonHang(Long id) {
        try {
            List<ChiTietDonHang> list = chiTietDonHangRepository.findByDonHangId(id);
            for (ChiTietDonHang o : list) {
                chiTietDonHangRepository.deleteById(o.getId());
            }
            donHangRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public Boolean addChiTietDonHang(ChiTietDonHangDto chiTietDonHangDto) {
        try {
            chiTietDonHangRepository.save(chiTietDonHangMapper.toEntity(chiTietDonHangDto));
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public Boolean updateChiTietDonHang(ChiTietDonHangDto chiTietDonHangDto) {
        try {
            chiTietDonHangRepository.save(chiTietDonHangMapper.toEntity(chiTietDonHangDto));
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public Boolean deleteChiTietDonHang(Long id) {
        try {
            chiTietDonHangRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}


