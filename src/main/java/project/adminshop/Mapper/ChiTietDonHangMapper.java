package project.adminshop.Mapper;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import project.adminshop.Entity.ChiTietDonHang;
import project.adminshop.Model.ChiTietDonHangDto;

import java.util.ArrayList;
import java.util.List;

public class ChiTietDonHangMapper {
    @Autowired
    private ModelMapper modelMapper = new ModelMapper();


    public ChiTietDonHangDto toDTO(ChiTietDonHang entity) {
        return modelMapper.map(entity, ChiTietDonHangDto.class);
    }

    public ChiTietDonHang toEntity(ChiTietDonHangDto dto) {
        return modelMapper.map(dto, ChiTietDonHang.class);
    }

    public List<ChiTietDonHangDto> toDTOs(List<ChiTietDonHang> entities) {
        List<ChiTietDonHangDto> dtos = new ArrayList<>();
        for (ChiTietDonHang entity : entities) {
            dtos.add(toDTO(entity));
        }
        return dtos;
    }
}
