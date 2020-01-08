package com.Dailydrip.config;
/**
 * homepage/druid  即可访问druid控制台
 * 
 */
import javax.servlet.ServletRegistration;
import javax.sql.DataSource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;

@Configuration
public class DruidConfig {
//	实现web监控的配置处理
	@Bean
	public ServletRegistrationBean druidServlet() {
		ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean(new StatViewServlet(),
				"/druid/*");
		servletRegistrationBean.addInitParameter("allow", "127.0.0.1,192.168.1.1");// 白名单
		servletRegistrationBean.addInitParameter("deny", "129.168.1.12");// 黑名单
		servletRegistrationBean.addInitParameter("loginUsername", "root");// 用户
		servletRegistrationBean.addInitParameter("loginPassword", "123456");// 密码
		servletRegistrationBean.addInitParameter("resetEnable", "false");// 可重置数据源
		return servletRegistrationBean;
	}

	@Bean // 监控
	public FilterRegistrationBean filterRegistrationBean() {
		FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
		filterRegistrationBean.setFilter(new WebStatFilter());
		filterRegistrationBean.addUrlPatterns("/"); // 对所有请求进行监控处理
		filterRegistrationBean.addInitParameter("exclusions", "*.js,*.gif,*.jpg,*.css,/druid/*");// 排除
		return filterRegistrationBean;
	}

	@Bean
	@ConfigurationProperties(prefix = "spring.datasources")
	public DataSource druidDataSource() {
		return new DruidDataSource();
	}

}
