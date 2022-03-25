package project.adminshop.Mapper;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import project.adminshop.Entity.NguoiDung;
import project.adminshop.Model.NguoiDungDto;

import java.util.ArrayList;
import java.util.List;

public class NguoiDungMapper {
    @Autowired
    private ModelMapper modelMapper= new ModelMapper();
    public NguoiDungDto toDTO(NguoiDung nguoiDung){
        return modelMapper.map(nguoiDung,NguoiDungDto.class);
    }
    public NguoiDung toEntity(NguoiDungDto nguoiDungDTO){
        return modelMapper.map(nguoiDungDTO,NguoiDung.class);
    }
    public List<NguoiDungDto> toDTOs(List<NguoiDung> nguoiDungs){
        List<NguoiDungDto> nguoiDungDtos=new ArrayList<>();
        for (NguoiDung nguoiDung:nguoiDungs){
            nguoiDungDtos.add(toDTO(nguoiDung));
        }
        return nguoiDungDtos;
    }
}
