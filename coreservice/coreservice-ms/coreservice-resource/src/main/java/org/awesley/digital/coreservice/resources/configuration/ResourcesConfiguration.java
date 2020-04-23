package org.awesley.digital.coreservice.resources.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.awesley.digital.coreservice.resources.implementation.Entity1ResourceFromModelMapper;
import org.awesley.digital.coreservice.resources.implementation.Entity1ResourceToModelMapper;
import org.awesley.digital.coreservice.resources.implementation.delegate.Entity1ApiImpl;
import org.awesley.digital.coreservice.resources.interfaces.IResourceFromModelMapper;
import org.awesley.digital.coreservice.resources.interfaces.IResourceToModelMapper;
import org.awesley.digital.coreservice.resources.interfaces.Entity1Api;
import org.awesley.digital.coreservice.resources.models.Entity1;
import org.awesley.infra.annotation.CustomizableBean;

@Configuration
public class ResourcesConfiguration {

	@CustomizableBean()
	public Entity1Api entity1Api(){
		return new Entity1ApiImpl();
	}
	
	@Bean
	public IResourceFromModelMapper<Entity1, org.awesley.digital.coreservice.service.model.Entity1> 
	entity1ResourceFromModelMapper(){
		return new Entity1ResourceFromModelMapper();
	}
	
	@Bean
	public IResourceToModelMapper<Entity1, org.awesley.digital.coreservice.service.model.Entity1>
	entity1ResourceToModelMapper(){
		return new Entity1ResourceToModelMapper();
	}
}
