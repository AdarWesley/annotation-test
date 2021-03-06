package org.awesley.digital.coreservice.resources.implementation;

import org.awesley.digital.coreservice.resources.interfaces.IResourceFromModelMapper;
import org.awesley.digital.coreservice.resources.models.Entity1;

public class Entity1ResourceFromModelMapper implements IResourceFromModelMapper<Entity1, org.awesley.digital.coreservice.service.model.Entity1> {

	@Override
	public Entity1 mapFrom(org.awesley.digital.coreservice.service.model.Entity1 modelEntity) {
		Entity1 entity1 = new Entity1();
		
		entity1.setId(modelEntity.getID());
		entity1.setName(modelEntity.getName());
		
		return entity1;
	}

}
