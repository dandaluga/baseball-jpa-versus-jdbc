package com.daluga.baseball.model.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.daluga.baseball.model.domain.Team;

@Repository
public class TeamDaoImpl implements TeamDao {

	private JdbcTemplate jdbcTemplate;

    @Autowired
    public void setDataSource(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }
    
	public Team findOne(Integer id) {
		String sql = "select * from baseball.team where id = ?";	
		Team team = this.jdbcTemplate.queryForObject(sql, new Object[]{id}, new TeamMapper() );
		return team;
	}

	public List<Team> findAll() {
		String sql = "select * from baseball.team";	
		List<Team> teams = this.jdbcTemplate.query(sql, new TeamMapper() );
		return teams;
	}
	
	private static final class TeamMapper implements RowMapper<Team> {

	    public Team mapRow(ResultSet rs, int rowNum) throws SQLException {
	        Team team = new Team();
	        team.setId(rs.getInt("id"));
	        team.setCode(rs.getString("code"));
	        team.setAbbreviation(rs.getString("abbreviation"));
	        team.setName(rs.getString("name"));
	        team.setCity(rs.getString("city"));
	        team.setStadium(rs.getString("stadium"));
	        return team;
	    }
	}
	
}


