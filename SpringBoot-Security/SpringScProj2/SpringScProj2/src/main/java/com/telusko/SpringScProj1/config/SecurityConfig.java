package com.telusko.SpringScProj1.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig 
{
	@Bean
     public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception
     {
//		http.csrf(customizer->customizer.disable());
//		http.authorizeHttpRequests(request->request.anyRequest().authenticated());
//		//http.formLogin(Customizer.withDefaults());
//		http.httpBasic(Customizer.withDefaults());
//		http.sessionManagement(session->session.sessionCreationPolicy(SessionCreationPolicy.STATELESS));
//		
//    	 return http.build();
//		Customizer<CsrfConfigurer<HttpSecurity>> configurer = 
//				new Customizer<CsrfConfigurer<HttpSecurity>>() {
//
//					@Override
//					public void customize(CsrfConfigurer<HttpSecurity> configurer) {
//						
//						configurer.disable();
//					}
//			
//		};
//		
//		
//		http.csrf(configurer);
		
		
		
		
		http.csrf(customizer->customizer.disable())
		.authorizeHttpRequests(request->request.anyRequest().authenticated())
		//http.formLogin(Customizer.withDefaults());
		.httpBasic(Customizer.withDefaults())
		.sessionManagement(session->session.sessionCreationPolicy(SessionCreationPolicy.STATELESS));
		
		
    	 return http.build();
     }
}
