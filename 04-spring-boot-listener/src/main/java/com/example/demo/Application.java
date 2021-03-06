package com.example.demo;

import com.example.demo.listener.servletcontext.ThreadListener;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@ServletComponentScan
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	public ServletListenerRegistrationBean<ThreadListener> getServletListenerRegistrationBean(){
		ServletListenerRegistrationBean<ThreadListener> bean = new ServletListenerRegistrationBean<>(new ThreadListener());
		return bean;
	}
}
