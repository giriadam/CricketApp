package com.entity;

import java.util.Arrays;

public class Team {
	
	private String tName;
	private String[] player;
	
	private Tournaments tournamentAdminName;
	
		
	
	
	public Team(String tName, String[] player, Tournaments tournamentAdminName) {
		super();
		this.tName = tName;
		this.player = player;
		this.tournamentAdminName = tournamentAdminName;
	}
	
	
	public Tournaments getTournamentAdminName() {
		return tournamentAdminName;
	}


	public void setTournamentAdminName(Tournaments tournamentAdminName) {
		this.tournamentAdminName = tournamentAdminName;
	}


	public String gettName() {
		return tName;
	}
	public void settName(String tName) {
		this.tName = tName;
	}
	public String[] getPlayer() {
		return player;
	}
	public void setPlayer(String[] player) {
		this.player = player;
	}


	@Override
	public String toString() {
		return "Team [tName=" + tName + ", player=" + Arrays.toString(player) + ", tournamentAdminName="
				+ tournamentAdminName + "]";
	}
	

	
	
	
	

}
