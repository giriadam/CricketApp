package com.cricketappservice;

import com.entity.Tournaments;

public interface MatchService {
	
	public void scheduleTeam();
	public void addMatchBetTeam(String t1,String t2);
	void addMatchBetTeam(String team1, String team2, Tournaments tournaments);

}
