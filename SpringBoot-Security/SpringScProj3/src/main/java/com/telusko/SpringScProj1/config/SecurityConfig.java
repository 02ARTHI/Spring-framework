package com.telusko.SpringScProj1.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig 
{
	@Autowired
	private UserDetailsService service;
	
	@Bean
     public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception
     {

		http.csrf(customizer->customizer.disable())
		.authorizeHttpRequests(request->request.anyRequest().authenticated())
		//http.formLogin(Customizer.withDefaults());
		.httpBasic(Customizer.withDefaults())
		.sessionManagement(session->session.sessionCreationPolicy(SessionCreationPolicy.STATELESS));
		
    	 return http.build();
     }
	
	@Bean
	public AuthenticationProvider authProvider()
	{
		DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
		provider.setUserDetailsService(service);
		//provider.setPasswordEncoder(NoOpPasswordEncoder.getInstance());
		provider.setPasswordEncoder(new BCryptPasswordEncoder(12));
		return provider;
	}
    	 
//    	 @Bean
//    	 public UserDetailsService userDetailsService()
//    	 {
//    		 UserDetails user=User.withDefaultPasswordEncoder()
//    				 .username("Alien")
//    				 .password("telusko@1")
//    				 .roles("USER")
//    				 .build();
//    		 
//    		 UserDetails admin=User.withDefaultPasswordEncoder()
//    				 .username("Navin")
//    				 .password("telusko@2")
//    				 .roles("ADMIN")
//    				 .build();
//    		 
//    		 
//    		 return new InMemoryUserDetailsManager(user, admin);
//    	 }
     
}
