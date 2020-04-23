package org.awesley.digital.coreservice.persistence.configuration;

import org.awesley.digital.coreservice.persistence.implementation.Entity1RepositoryImplementation;
import org.awesley.digital.coreservice.persistence.implementation.jpa.entities.JpaEntity1;
import org.awesley.digital.coreservice.service.interfaces.IEntity1Repository;
import org.awesley.digital.coreservice.service.model.Entity1;
import org.awesley.infra.query.jpa.QueryExpressionToJpaVisitor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@Configuration
@EnableJpaRepositories(basePackages = { "org.awesley.digital.coreservice.persistence.implementation.jpa.repositories" })
@EntityScan(basePackages = { "org.awesley.digital.coreservice.persistence.implementation.jpa.entities" })
@ComponentScan(basePackageClasses = { QueryExpressionToJpaVisitor.class })
public class PersistenceConfiguration {

	@Bean
	public IEntity1Repository entity1Repository() {
		return new Entity1RepositoryImplementation();
	}
	
	@Bean
	@Scope("prototype")
	public Entity1 entity1() {
		return new JpaEntity1();
	}
}
