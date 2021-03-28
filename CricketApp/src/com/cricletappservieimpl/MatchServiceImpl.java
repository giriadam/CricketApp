package com.cricletappservieimpl;

import com.cricketappservice.MatchService;
import com.entity.Schedule;
import com.entity.Tournaments;

public class MatchServiceImpl implements MatchService {

	@Override
	public void scheduleTeam() {
		// TODO Auto-generated method stub
		
	}

	
	@Override
	public void addMatchBetTeam(String team1, String team2, Tournaments tournaments) {
		// TODO Auto-generated method stub
		System.out.println("Match is going to between :"+team1 +" and "+team2);
		Schedule schedule=new Schedule("Narendra Modi Stadium", "Ahmedabad", "28/3/2021", team1, team2,tournaments.getTournamentName(),tournaments.getTournament_Admin_Name());
	}

	@Override
	public void addMatchBetTeam(String t1, String t2) {
		// TODO Auto-generated method stub
		
	}



}
