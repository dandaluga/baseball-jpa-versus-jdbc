package com.daluga.baseball.model.service;

import java.util.List;

import com.daluga.baseball.model.domain.Team;

public interface TeamService {
	public Team get(Integer id);
	public List<Team> getAll();
}
