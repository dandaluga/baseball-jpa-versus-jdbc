package com.daluga.baseball.model.service;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.daluga.baseball.model.domain.Team;
import com.daluga.baseball.model.repository.TeamRepository;
import com.google.common.collect.Sets;

@Repository
@Transactional(readOnly=true)
public class TeamServiceImpl implements TeamService {

	@Autowired
	TeamRepository repository = null;
	
	public Team get(Integer id) {
		return repository.findOne(id);
	}

	public Set<Team> getAll() {
		// TODO: Is converting the Iterable to a Set reading and loading the collection into memory? Could be an issue with large result sets.
		return Sets.newHashSet(repository.findAll());
	}

}
