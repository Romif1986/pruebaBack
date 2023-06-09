
package com.trabajo.ap.Security;

import com.trabajo.ap.Security.Service.UserDetailsImpl;
import com.trabajo.ap.Security.jwt.JwtEntryPoint;
import com.trabajo.ap.Security.jwt.JwtTokenFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class MainSecurity extends WebSecurityConfigurerAdapter{
    @Autowired
    UserDetailsImpl userDetailsServiceImpl;
    @Autowired
    JwtEntryPoint jwtEntryPoint;
    
    @Bean
    public JwtTokenFilter jwtTokenFilter(){
        return new JwtTokenFilter();
        
    }
    
    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }
    @Override
    protected void configure(HttpSecurity http) throws Exception {
       http.cors().and().csrf().disable()
               .authorizeRequests()
               .andMatchers("/auth/* *").permitAll()
               .anyRequest().authenticated
               .and()
               .exceptionHandling().authenticationEntryPoint(jwtEntryPoint)
               .and()
               .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
    }
    
    
    
    @Override
    protected AuthenticationManager authenticationManager() throws Exception {
           return super.authenticationManager();
    }
    @Override
    public AuthenticationManager authenticationManagerBean() throws Exception{
        return super.authenticationamanagerBean();
    }
    
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsServiceImpl).passwordEncoder(passwordEncoder());
    }
    
    
    
}
