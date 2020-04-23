package org.awesley.digital.coreservice.resources.interfaces;

public interface IResourceToModelMapper<ResourceType, ModelType> {
	ModelType mapTo(ResourceType resourceEntity);
}
