package org.zovi.cloudtut.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/*
 * 	CSRF should be disabled, since we are using rest end points and CSRF are used in case of browser
 * 	If You Don't, you will get 403 for post rest end point /monitor for spring cloud bus
 */

@Configuration
public class ConfigServerSecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		super.configure(http);
		http.csrf().disable();
	}
	
}
