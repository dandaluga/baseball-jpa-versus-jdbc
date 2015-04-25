package com.daluga.baseball.model.repository;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.RepositoryDefinition;

import com.daluga.baseball.model.domain.Team;

@RepositoryDefinition(domainClass=Team.class, idClass=Integer.class)
public interface TeamRepository extends CrudRepository<Team, Integer>, JpaSpecificationExecutor<Team> {

}
