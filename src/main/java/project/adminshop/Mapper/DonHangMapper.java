package project.adminshop.Mapper;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import project.adminshop.Entity.DonHang;
import project.adminshop.Model.DonHangDto;

import java.util.ArrayList;
import java.util.List;

public class DonHangMapper {

    @Autowired
    private ModelMapper modelMapper = new ModelMapper();

    public DonHangDto toDTO(DonHang donHang) {
        return modelMapper.map(donHang, DonHangDto.class);
    }

    public DonHang toEntity(DonHangDto donHangDto) {
        return modelMapper.map(donHangDto, DonHang.class);
    }

    public List<DonHangDto> toDTOs(List<DonHang> donHangs) {
        List<DonHangDto> donHangDtos = new ArrayList<>();
        for (DonHang donHang : donHangs) {
            donHangDtos.add(toDTO(donHang));
        }
        return donHangDtos;
    }

}
