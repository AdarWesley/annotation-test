package org.awesley.digital.customservice.resources.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.awesley.digital.customservice.resources.implementation.Entity1ResourceToModelMapper;
import org.awesley.digital.customservice.resources.implementation.delegate.Entity1ApiImpl;
import org.awesley.digital.coreservice.resources.interfaces.Entity1Api;
import org.awesley.digital.coreservice.resources.interfaces.IResourceToModelMapper;
import org.awesley.digital.coreservice.resources.models.Entity1;

@Configuration
@Import(org.awesley.digital.coreservice.resources.configuration.ResourcesConfiguration.class)
public class ResourcesConfiguration {
	
	@Bean
	public Entity1Api entity1Api(){
		return new Entity1ApiImpl();
	}
	
//	@Bean
//	public IResourceToModelMapper<Entity1, org.awesley.digital.coreservice.service.model.Entity1>
//	entity1ResourceToModelMapper(){
//		return new Entity1ResourceToModelMapper();
//	}
	
}