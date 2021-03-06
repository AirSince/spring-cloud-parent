package com.learn.server.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @author zhang
 * @projectName spring-cloud-parent
 * @title SecurityConfig
 * @package com.learn.server.config
 * @description 安全登录验证
 * @date 2019/11/21 4:32 下午
 */
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// 配置全部路径不认证
		http.authorizeRequests().anyRequest().permitAll().and().logout().permitAll();
	}
}
