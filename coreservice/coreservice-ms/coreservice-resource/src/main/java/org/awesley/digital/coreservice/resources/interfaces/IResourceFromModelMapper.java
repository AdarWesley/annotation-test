package org.awesley.digital.coreservice.resources.interfaces;

public interface IResourceFromModelMapper<ResourceType, ModelType> {

	ResourceType mapFrom(ModelType modelEntity);

}
