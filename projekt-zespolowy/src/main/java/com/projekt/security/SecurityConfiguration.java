package com.projekt.security;

import static com.projekt.game_project.interfaces.GameProjectDeleteController.DELETE_URL;
import static com.projekt.game_project.interfaces.GameProjectDetailController.DETAIL_PATH;
import static com.projekt.game_project.interfaces.GameProjectEditController.EDIT_PATH;
import static com.projekt.game_project.interfaces.GameProjectListController.LIST_PATH;
import static com.projekt.menu.interfaces.MenuController.ABOUT_URL;
import static com.projekt.menu.interfaces.MenuController.CONTACT_URL;
import static com.projekt.menu.interfaces.MenuController.MENU_URL;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;


@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

	private static final String ADMIN_USERNAME = "admin";
	private static final String ADMIN_PASSWORD = "admin";
	private static final String ADMIN_ROLE = "admin";

	@Bean
	@Override
	public UserDetailsService userDetailsService() {

		UserDetails adminUserDetails = User.withUsername(ADMIN_USERNAME)
			.passwordEncoder(PasswordEncoderFactories.createDelegatingPasswordEncoder()::encode)
			.password(ADMIN_PASSWORD).roles(ADMIN_ROLE).build();

		InMemoryUserDetailsManager userDetailsManager = new InMemoryUserDetailsManager();

		userDetailsManager.createUser(adminUserDetails);

		return userDetailsManager;
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {

		http.csrf().disable()
			.authorizeRequests()
			.antMatchers(MENU_URL, ABOUT_URL, CONTACT_URL, LIST_PATH, DETAIL_PATH, "/*.css", "/*.png", "/images/**").permitAll()
			.antMatchers(EDIT_PATH, DELETE_URL).hasAnyRole(ADMIN_ROLE)
			.anyRequest().authenticated()
			.and()
			.formLogin().permitAll()
			.and()
			.logout().permitAll()
			.and()
			.httpBasic();
	}

	@Override
	public void configure(WebSecurity web) throws Exception {

		web.ignoring()
			.antMatchers("*/style.css")
			.antMatchers("/images/Me.JPG");
	}

}
