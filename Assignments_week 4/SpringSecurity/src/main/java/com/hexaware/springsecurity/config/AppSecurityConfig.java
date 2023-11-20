package com.hexaware.springsecurity.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;

import net.bytebuddy.agent.builder.AgentBuilder.Default.WarmupStrategy.NoOp;
@Configuration
@EnableWebSecurity
public class AppSecurityConfig extends WebSecurityConfigurerAdapter {

	
	/*
	@Override
	@Bean
	protected UserDetailsService userDetailsService() {
		
		
		List<UserDetails> users =new ArrayList<UserDetails>();
		
		users.add(User.withDefaultPasswordEncoder().username("javeed").password("tiger").roles("user").build());
		
		
		
		return new InMemoryUserDetailsManager(users);
		
		
	}
	*/
	@Autowired
	private UserDetailsService userDetailsService;
	
	public AuthenticationProvider authProvider(){
		DaoAuthenticationProvider provider=new DaoAuthenticationProvider();
		
		provider.setUserDetailsService(userDetailsService);
		provider.setPasswordEncoder(NoOpPasswordEncoder.getInstance());
		
		return provider;
		
		
	}
	

}
