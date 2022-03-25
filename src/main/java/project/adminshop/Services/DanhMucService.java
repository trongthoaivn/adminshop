package project.adminshop.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.adminshop.Mapper.DanhMucMapper;
import project.adminshop.Model.DanhMucDto;
import project.adminshop.Repository.DanhMucRepository;

import java.util.List;

@Service
public class DanhMucService {
    @Autowired
    private DanhMucRepository danhMucRepository;

    private DanhMucMapper danhMucMapper = new DanhMucMapper();

    public List<DanhMucDto> getAllDanhMuc() {
        return danhMucMapper.toDtos(danhMucRepository.findAll());
    }

    public DanhMucDto getDanhMucById(Long id) {
        return danhMucMapper.toDto(danhMucRepository.findById(id).get());
    }

    public Boolean createDanhMuc(DanhMucDto danhMucDto) {
        try {
            danhMucRepository.save(danhMucMapper.toEntity(danhMucDto));
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public Boolean updateDanhMuc(DanhMucDto danhMucDto) {
        try {
            danhMucRepository.save(danhMucMapper.toEntity(danhMucDto));
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public Boolean deleteDanhMuc(Long id) {
        try {
            danhMucRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
