package com.daluga.baseball.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.daluga.baseball.model.dao.TeamDao;
import com.daluga.baseball.model.domain.Team;

@Service
public class TeamServiceImpl implements TeamService {

	@Autowired
	TeamDao dao = null;
	
	public Team get(Integer id) {
		return dao.findOne(id);
	}

	public List<Team> getAll() {
		return dao.findAll();
	}

}
