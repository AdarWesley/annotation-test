package org.awesley.digital.coreservice.service.interfaces;

import java.util.List;

import org.awesley.digital.coreservice.service.model.Entity1;
import org.awesley.infra.query.QueryExpression;

public interface IEntity1FindService {

	List<? extends Entity1> find(QueryExpression expression, Integer startIndex, Integer pageSize);

}
