package com.daluga.baseball.model;

import java.util.Set;

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
		dumpTeam();
	}

	public void dumpTeam() {
		Set<Team> teams = teamService.getAll();
		
		for (Team team : teams) {
			System.out.println("City: " + team.getCity() + " Name: " + team.getName());
		}
	}
		
}