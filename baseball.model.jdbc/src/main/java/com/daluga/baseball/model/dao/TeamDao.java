package com.daluga.baseball.model.dao;

import java.util.List;

import com.daluga.baseball.model.domain.Team;

public interface TeamDao {
	public Team findOne(Integer id);
	public List<Team> findAll();
}
