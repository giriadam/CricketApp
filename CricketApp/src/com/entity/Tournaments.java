package com.entity;

public class Tournaments {
	
	private String tournamentName;
	private String tournament_Admin_Name;
	
	public Tournaments()
	{}
	
	public Tournaments(String tournamentName, String tournament_Admin_Name) {
		super();
		this.tournamentName = tournamentName;
		this.tournament_Admin_Name = tournament_Admin_Name;
		
		System.out.println(toString());
	}
	public String getTournamentName() {
		return tournamentName;
	}
	public void setTournamentName(String tournamentName) {
		this.tournamentName = tournamentName;
	}
	public String getTournament_Admin_Name() {
		return tournament_Admin_Name;
	}
	public void setTournament_Admin_Name(String tournament_Admin_Name) {
		this.tournament_Admin_Name = tournament_Admin_Name;
	}
	@Override
	public String toString() {
		return "Tournaments [tournamentName=" + tournamentName + ", tournament_Admin_Name=" + tournament_Admin_Name
				+ "]";
	}
	
	

}
