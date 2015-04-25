package com.daluga.baseball.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.daluga.baseball.model.domain.Team;
import com.daluga.baseball.model.service.TeamService;

@Component
public class App {
  
	@Autowired
	private TeamService teamService;
	
	public static void main( String[] args) {
    	AbstractApplicationContext context = new ClassPathXmlApplicationContext("baseball-model-beans.xml");
    	App app = context.getBean(App.class);
    	app.execute();
    	context.close();
    }

	public void execute() {
		dumpAllTeams();
		dumpOneTeam();
	}

	public void dumpAllTeams() {
		List<Team> teams = teamService.getAll();
		
		if (teams != null && teams.size() > 0) {
			for (Team team : teams) {
				System.out.println("City: " + team.getCity() + " Name: " + team.getName());
			}
		}
	}
	
	public void dumpOneTeam() {
		Team team = teamService.get(112);
		
		if (team != null) {
			System.out.println("City: " + team.getCity() + " Name: " + team.getName());
		}
	}
}