package com.telusko.SpringScProj1.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.authentication.configurers.userdetails.DaoAuthenticationConfigurer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig 
{
	@Autowired
	private UserDetailsService user;
	
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
	
	@Bean
	 public AuthenticationProvider auth()
	 {
		 DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
		 provider.setUserDetailsService(user);
		 provider.setPasswordEncoder(NoOpPasswordEncoder.getInstance());
		 return provider;
	 }
//	
//	@Bean
//	public UserDetailsService service()
//	{
//		UserDetails user = User.withDefaultPasswordEncoder().username("arthi").password("arthi").roles("user").build();
//		UserDetails admin = User.withDefaultPasswordEncoder().username("art").password("art").roles("user").build();
//		
//		return new InMemoryUserDetailsManager(user,admin);
//	}
}
