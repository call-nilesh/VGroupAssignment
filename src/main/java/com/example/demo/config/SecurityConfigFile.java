package com.example.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
@Configuration
public class SecurityConfigFile extends WebSecurityConfigurerAdapter{
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().withUser("admin").password("{noop}admin").roles("ADMIN");
		auth.inMemoryAuthentication().withUser("ds").password("{noop}ds").roles("USER");
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
	//	logger.debug("Using default configure(HttpSecurity). If subclassed this will potentially override subclass configure(HttpSecurity).");

		http
		.authorizeRequests()
		.antMatchers("/sendData","/h2-console/**")
		.hasRole("ADMIN")
			.anyRequest()
			.fullyAuthenticated() 
			.and()
		.httpBasic();		
		http.csrf().disable();
		http.headers().frameOptions().disable();
	}

}
