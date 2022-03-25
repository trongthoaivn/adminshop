package project.adminshop.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.adminshop.Mapper.HangSanXuatMapper;
import project.adminshop.Model.HangSanXuatDto;
import project.adminshop.Repository.HangSanXuatRepository;

import java.util.List;

@Service
public class HangSanXuatService {

    @Autowired
    private HangSanXuatRepository hangSanXuatRepository;

    private HangSanXuatMapper hangSanXuatMapper = new HangSanXuatMapper();

    public List<HangSanXuatDto> getAllHangSanXuat() {
        return hangSanXuatMapper.toDTOs(hangSanXuatRepository.findAll());
    }

    public HangSanXuatDto getHangSanXuatById(Long id) {
        return hangSanXuatMapper.toDTO(hangSanXuatRepository.findById(id).get());
    }

    public Boolean addHangSanXuat(HangSanXuatDto hangSanXuatDto) {
        try {
            hangSanXuatRepository.save(hangSanXuatMapper.toEntity(hangSanXuatDto));
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public Boolean updateHangSanXuat(HangSanXuatDto hangSanXuatDto) {
        try {
            hangSanXuatRepository.save(hangSanXuatMapper.toEntity(hangSanXuatDto));
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public Boolean deleteHangSanXuat(Long id) {
        try {
            hangSanXuatRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

}
