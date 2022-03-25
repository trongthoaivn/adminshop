package project.adminshop.Mapper;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import project.adminshop.Entity.HangSanXuat;
import project.adminshop.Model.HangSanXuatDto;

import java.util.ArrayList;
import java.util.List;


public class HangSanXuatMapper {


    @Autowired
    private ModelMapper modelMapper = new ModelMapper();

    public HangSanXuatDto toDTO(HangSanXuat entity) {
        return modelMapper.map(entity, HangSanXuatDto.class);
    }

    public HangSanXuat toEntity(HangSanXuatDto dto) {
        return modelMapper.map(dto, HangSanXuat.class);
    }

    public List<HangSanXuatDto> toDTOs(List<HangSanXuat> entities) {
            List<HangSanXuatDto> dtos = new ArrayList<>();
            for (HangSanXuat entity : entities) {
                dtos.add(toDTO(entity));
            }
        return dtos;
    }
}
