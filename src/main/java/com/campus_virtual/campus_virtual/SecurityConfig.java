/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.campus_virtual.campus_virtual;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 *
 * @author Christian
 */
@Configuration
@EnableWebSecurity

public class SecurityConfig extends WebSecurityConfigurerAdapter{
  
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception
    {
    auth.inMemoryAuthentication()
         .withUser("Christian")
           .password("{noop}1234")
            .roles("Admin","Profesor","Estudiante")
            .and()
            .withUser("Mateo")
           .password("{noop}1234")
           .roles("Admin","Profesor")
          .and()
            .withUser("Michelle")
           .password("{noop}1234")
           .roles("Profesor");
    }
   
    
}
