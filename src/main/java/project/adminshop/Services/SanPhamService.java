package project.adminshop.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.adminshop.Mapper.SanPhamMapper;
import project.adminshop.Model.SanPhamDto;
import project.adminshop.Repository.SanPhamRepository;

import java.util.List;

@Service
public class SanPhamService {

    @Autowired
    private SanPhamRepository sanPhamRepository;

    private SanPhamMapper sanPhamMapper = new SanPhamMapper();

    public SanPhamDto getSanPhamById(Long id){
        return sanPhamMapper.toDTO(sanPhamRepository.findById(id).get());
    }

    public List<SanPhamDto> getAllSanPham(){
        return sanPhamMapper.toDTOs(sanPhamRepository.findAll());
    }

    public List<SanPhamDto> getAllSanPhamByDanhMuc(Long id){
        return sanPhamMapper.toDTOs(sanPhamRepository.findAllByDanhMucId(id));
    }

    public List<SanPhamDto> getAllSanPhamByThuongHieu(Long id){
        return sanPhamMapper.toDTOs(sanPhamRepository.findAllByIdBrand(id));
    }

    public Boolean addSanPham(SanPhamDto sanPhamDto){
        try {
            sanPhamRepository.save(sanPhamMapper.toEntity(sanPhamDto));
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public Boolean updateSanPham(SanPhamDto sanPhamDto){
        try {
            sanPhamRepository.save(sanPhamMapper.toEntity(sanPhamDto));
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public Boolean deleteSanPham(Long id){
        try {
            sanPhamRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
