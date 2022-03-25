package project.adminshop.Mapper;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import project.adminshop.Entity.VaiTro;
import project.adminshop.Model.VaiTroDto;

import java.util.ArrayList;
import java.util.List;

public class VaiTroMapper {

    @Autowired
    private ModelMapper modelMapper = new ModelMapper();

    public VaiTroDto toDto(VaiTro vaiTro) {
        return modelMapper.map(vaiTro, VaiTroDto.class);
    }

    public VaiTro toEntity(VaiTroDto vaiTroDto) {
        return modelMapper.map(vaiTroDto, VaiTro.class);
    }

    public List<VaiTroDto> toDtos(List<VaiTro> vaiTros) {
        List<VaiTroDto> vaiTroDtos = new ArrayList<>();
        for (VaiTro vaiTro : vaiTros) {
            vaiTroDtos.add(toDto(vaiTro));
        }
        return vaiTroDtos;
    }
}
