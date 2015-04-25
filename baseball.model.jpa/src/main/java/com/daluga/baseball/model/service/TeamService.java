package com.daluga.baseball.model.service;

import java.util.Set;

import com.daluga.baseball.model.domain.Team;

public interface TeamService {
	public Team get(Integer id);
	public Set<Team> getAll();
}
