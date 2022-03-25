package project.adminshop.Mapper;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import project.adminshop.Entity.SanPham;
import project.adminshop.Model.SanPhamDto;

import java.util.ArrayList;
import java.util.List;

public class SanPhamMapper {

    @Autowired
    private ModelMapper modelMapper = new ModelMapper();

    public SanPhamDto toDTO(SanPham sanPham) {
        return modelMapper.map(sanPham, SanPhamDto.class);
    }

    public SanPham toEntity(SanPhamDto sanPhamDTO) {
        return modelMapper.map(sanPhamDTO, SanPham.class);
    }

    public List<SanPhamDto> toDTOs(List<SanPham> sanPhams) {
        List<SanPhamDto> sanPhamDTOs = new ArrayList<>();
        for (SanPham sanPham : sanPhams) {
            sanPhamDTOs.add(toDTO(sanPham));
        }
        return sanPhamDTOs;
    }
}
