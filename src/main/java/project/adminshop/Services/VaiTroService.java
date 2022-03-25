package project.adminshop.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.adminshop.Mapper.VaiTroMapper;
import project.adminshop.Model.VaiTroDto;
import project.adminshop.Repository.VaiTroRepository;

import java.util.List;

@Service
public class VaiTroService {
    @Autowired
    private VaiTroRepository vaiTroRepository;
    private VaiTroMapper vaiTroMapper = new VaiTroMapper();

    public List<VaiTroDto> getAllVaiTro(){
        return vaiTroMapper.toDtos(vaiTroRepository.findAll());
    }

    public VaiTroDto getVaiTroById(Long id){
        return vaiTroMapper.toDto(vaiTroRepository.findById(id).get());
    }

    public Boolean createVaiTro(VaiTroDto vaiTroDto){
        try{
            vaiTroRepository.save(vaiTroMapper.toEntity(vaiTroDto));
            return true;
        }catch (Exception e){
            return false;
        }
    }

    public Boolean updateVaiTro(VaiTroDto vaiTroDto){
        try{
            vaiTroRepository.save(vaiTroMapper.toEntity(vaiTroDto));
            return true;
        }catch (Exception e){
            return false;
        }
    }

    public Boolean deleteVaiTro(Long id){
        try{
            vaiTroRepository.deleteById(id);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
