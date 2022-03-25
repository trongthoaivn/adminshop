package project.adminshop.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class AuthController {
    @GetMapping(value ={ "/login"})
    public String login(){
        return "/Auth/Login";
    }

    @GetMapping(value = "/register")
    public String register(){
        return "/Auth/Register";
    }


}
