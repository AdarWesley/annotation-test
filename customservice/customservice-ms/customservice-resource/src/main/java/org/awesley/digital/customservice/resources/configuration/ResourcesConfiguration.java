package org.awesley.digital.customservice.resources.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.awesley.digital.customservice.resources.implementation.delegate.Entity1ApiImpl;
import org.awesley.digital.coreservice.resources.interfaces.Entity1Api;

@Configuration
@Import(org.awesley.digital.coreservice.resources.configuration.ResourcesConfiguration.class)
public class ResourcesConfiguration {
	@Bean
	public Entity1Api entity1Api(){
		this.getClass();
		return new Entity1ApiImpl();
	}	
}