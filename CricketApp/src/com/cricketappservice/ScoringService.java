package com.cricketappservice;

import com.entity.Score;
import com.entity.Team;

public interface ScoringService {

	public void score(Team team,int runs);
	public void downWicket(Team team,int wicket);
	public Score getScore(Team team);
	
}
