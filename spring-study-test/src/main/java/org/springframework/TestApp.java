package org.springframework;

import java.util.Arrays;
import org.springframework.conf.Config;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		String[] beanNames = context.getBeanDefinitionNames();
		Arrays.asList(beanNames).forEach(System.out::println);
	}

}
