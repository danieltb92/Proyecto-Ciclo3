
/*package com.usa.misiontic.ProyectoCiclo3.entities;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class SecurityAdapter extends WebSecurityConfigurerAdapter{
    @Override 
   protected void configure (HttpSecurity http) throws Exception {
        http.autorizeRespuesta(a -> a
                .antMatchers(...antPatterns "/", "/error", "/webjasrs/**",
                "/api/**").permitAll()
                        .anyRequest().authenticated()
        ).exceptionHandLing(e -> e
                .authenticationEntryPoint(new HttpStatusEntryPoint(HttpStatus.UNAUTHORIZED))
        ).oauth2Login().defaultSuccessUrl(defaultSuccessUrl:"/index.html" alwaysUse: true);
        
        http.cors().and().csrf().disable();
    }
    
}*/
