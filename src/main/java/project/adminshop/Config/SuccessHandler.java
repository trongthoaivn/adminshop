package project.adminshop.Config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;
import project.adminshop.Entity.NguoiDung;
import project.adminshop.Repository.NguoiDungRepository;
import project.adminshop.Services.NguoiDungService;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@Component
public class SuccessHandler implements AuthenticationSuccessHandler {

    @Autowired
    NguoiDungRepository nguoiDungRepository;


    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {
     NguoiDung nguoiDung = nguoiDungRepository.findByEmail(authentication.getName());
     if (nguoiDung.getMaVaiTro().getTenVaiTro().equals("ROLE_ADMIN")){
         response.sendRedirect("/admin/home");
     }else {
         response.sendRedirect("/login");
     }
    }
}
