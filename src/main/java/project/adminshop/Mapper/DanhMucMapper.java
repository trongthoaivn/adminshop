package project.adminshop.Mapper;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import project.adminshop.Entity.DanhMuc;
import project.adminshop.Model.DanhMucDto;

import java.util.ArrayList;
import java.util.List;

public class DanhMucMapper {
    @Autowired
    private ModelMapper modelMapper = new ModelMapper();
    public DanhMucDto toDto(DanhMuc danhMucDto){
        return modelMapper.map(danhMucDto,DanhMucDto.class);
    }
    public DanhMuc toEntity(DanhMucDto danhMucDto){
        return modelMapper.map(danhMucDto,DanhMuc.class);
    }

    public List<DanhMucDto> toDtos(List<DanhMuc> danhMucs){
        List<DanhMucDto> danhMucDtos = new ArrayList<>();
        for (DanhMuc danhMuc : danhMucs) {
            danhMucDtos.add(modelMapper.map(danhMuc,DanhMucDto.class));
        }
        return danhMucDtos;
    }
}
