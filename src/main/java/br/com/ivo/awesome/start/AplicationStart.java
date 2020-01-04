package br.com.ivo.awesome.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@ComponentScan(basePackages = "br.com.ivo.awesome.endpoint")
public class AplicationStart {
	public static void main(String[] args) {
		SpringApplication.run(AplicationStart.class, args);
	}
}
