package org.awesley.digital.customservice.resources.implementation;

import org.awesley.digital.coreservice.resources.interfaces.IResourceToModelMapper;
import org.awesley.digital.coreservice.resources.models.Entity1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

public class Entity1ResourceToModelMapper implements IResourceToModelMapper<Entity1, org.awesley.digital.coreservice.service.model.Entity1> {

	@Autowired
	private ApplicationContext ctx;
	
	@Override
	public org.awesley.digital.coreservice.service.model.Entity1 mapTo(Entity1 resourceEntity) {
		org.awesley.digital.coreservice.service.model.Entity1 modelEntity = 
				ctx.getBean(org.awesley.digital.coreservice.service.model.Entity1.class);
		
		modelEntity.setID(resourceEntity.getId());
		modelEntity.setName(resourceEntity.getName());
		
		return modelEntity;
	}

}
