package project.adminshop.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import project.adminshop.Class.CustomUserDetails;
import project.adminshop.Class.RestponseDTO;
import project.adminshop.Entity.NguoiDung;
import project.adminshop.Mapper.NguoiDungMapper;
import project.adminshop.Model.NguoiDungDto;
import project.adminshop.Repository.NguoiDungRepository;

import java.util.List;

@Service
public class NguoiDungService implements UserDetailsService {

    @Autowired
    private NguoiDungRepository nguoiDungRepository;

    NguoiDungMapper nguoiDungMapper = new NguoiDungMapper();
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        NguoiDung nguoiDung = nguoiDungRepository.findByEmail(username);
        if (nguoiDung == null) {
            throw new UsernameNotFoundException("Không tìm thấy người dùng");
        }
        return new CustomUserDetails(nguoiDung) ;
    }
    public List<NguoiDungDto> getAllNguoiDung() {
       return nguoiDungMapper.toDTOs(nguoiDungRepository.findAll());
    }

    public NguoiDungDto getNguoiDungById(Long id) {
        return nguoiDungMapper.toDTO(nguoiDungRepository.findById(id).get());
    }

    public NguoiDungDto getNguoiDungByEmail(String email) {
        return nguoiDungMapper.toDTO(nguoiDungRepository.findByEmail(email));
    }

    public Boolean createNguoiDung(NguoiDungDto nguoiDungDto) {
        try {
            nguoiDungRepository.save(nguoiDungMapper.toEntity(nguoiDungDto));
            return true;
        }catch (Exception e){
            return false;
        }
    }

    public Boolean updateNguoiDung(NguoiDungDto nguoiDungDto) {
        try {
            nguoiDungRepository.save(nguoiDungMapper.toEntity(nguoiDungDto));
            return true;
        }catch (Exception e){
            return false;
        }
    }

    public Boolean deleteNguoiDung(Long id) {
        try {
            nguoiDungRepository.deleteById(id);
            return true;
        }catch (Exception e){
            return false;
        }
    }


}
