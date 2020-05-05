package org.springframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.pojo.Car;

@Configuration
public class Config {

	@Bean
	public Car getCar(){
		return new Car();
	}

}
