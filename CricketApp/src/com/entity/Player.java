package com.entity;

public class Player {
	
	private String pName;
	private String pType;
	private String teamName;
	private String tournamentName;
		
	public Player(String pName, String pType, String teamName, String tournamentName) {
		super();
		this.pName = pName;
		this.pType = pType;
		this.teamName = teamName;
		this.tournamentName = tournamentName;
	}
	
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public String getTournamentName() {
		return tournamentName;
	}
	public void setTournamentName(String tournamentName) {
		this.tournamentName = tournamentName;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public String getpType() {
		return pType;
	}
	public void setpType(String pType) {
		this.pType = pType;
	}
	public Player(String pName, String pType) {
		super();
		this.pName = pName;
		this.pType = pType;
	}

	@Override
	public String toString() {
		return "Player [pName=" + pName + ", pType=" + pType + ", teamName=" + teamName + ", tournamentName="
				+ tournamentName + "]";
	}
	
	

}
