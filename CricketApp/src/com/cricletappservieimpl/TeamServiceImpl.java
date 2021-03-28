package com.cricletappservieimpl;

import com.cricketappservice.TeamService;
import com.entity.Team;

public class TeamServiceImpl implements TeamService {

	
	
	@Override
	public void addTeam(Team team) {
		// TODO Auto-generated method stub
		System.out.println("team Information :"+team.toString());
	}

}
