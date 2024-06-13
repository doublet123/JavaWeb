package edu.sandau.b230111.b23011104;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class B23011104Application extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(B23011104Application.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(B23011104Application.class);
	}

}
