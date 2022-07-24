package com.andreidodu.buslinemanager;

import java.io.IOException;

import org.dozer.spring.DozerBeanMapperFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.ResourcePatternResolver;

@Configuration
public class DozerConfig {
	@Bean
	public DozerBeanMapperFactoryBean dozerMapper(ResourcePatternResolver resourcePatternResolver) throws IOException {
		DozerBeanMapperFactoryBean factoryBean = new DozerBeanMapperFactoryBean();
//        factoryBean.setMappingFiles(
//            resourcePatternResolver.getResources("classpath*:/*mapping.xml"));

		return factoryBean;
	}
}
