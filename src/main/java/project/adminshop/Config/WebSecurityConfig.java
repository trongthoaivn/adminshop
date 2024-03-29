package project.adminshop.Config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import project.adminshop.Services.NguoiDungService;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    NguoiDungService nguoiDungService;

    @Autowired
    AuthenticationSuccessHandler successHandler;

    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(nguoiDungService).passwordEncoder(passwordEncoder());
    }

    @Override
    protected  void configure(HttpSecurity http) throws Exception{

        http.
                authorizeRequests().
                antMatchers("/login","/register").permitAll().
                anyRequest().authenticated().


                //

                and().formLogin()
                .defaultSuccessUrl("/admin/home",true)
                .loginPage("/login")
                .permitAll().

                //

                and().logout().
                permitAll()

                //

                .and().csrf().disable();
    }
    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring().antMatchers("/resources/**", "/static/**", "/css/**", "/js/**", "/images/**", "/webjars/**","/vendor/**");
    }
}
