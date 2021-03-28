package com.entity;

public class Schedule {
	
	private String stadiumName;
	private String location;
	private String dateAndTime;
	private String teamOneName;
	private String teamTwoName;
	private Tournaments tournaments;
	
	
	public Schedule(String stadiumName, String location, String dateAndTime, String teamOneName, String teamTwoName,
			Tournaments tournaments) {
		super();
		this.stadiumName = stadiumName;
		this.location = location;
		this.dateAndTime = dateAndTime;
		this.teamOneName = teamOneName;
		this.teamTwoName = teamTwoName;
		this.tournaments = tournaments;
	}
	public Schedule(String stadiumName, String location, String dateAndTime, String team1, String team2, String tournamentName,
			String tournament_Admin_Name) {
		// TODO Auto-generated constructor stub
		System.out.println( stadiumName +"\n"+ location+"\n"+ dateAndTime+"\n"+ team1+"\n"+ team2+"\n"+ tournamentName+"\n"+ tournament_Admin_Name);
	}
	public String getStadiumName() {
		return stadiumName;
	}
	public void setStadiumName(String stadiumName) {
		this.stadiumName = stadiumName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getDateAndTime() {
		return dateAndTime;
	}
	public void setDateAndTime(String dateAndTime) {
		this.dateAndTime = dateAndTime;
	}
	public String getTeamOneName() {
		return teamOneName;
	}
	public void setTeamOneName(String teamOneName) {
		this.teamOneName = teamOneName;
	}
	public String getTeamTwoName() {
		return teamTwoName;
	}
	public void setTeamTwoName(String teamTwoName) {
		this.teamTwoName = teamTwoName;
	}
	public Tournaments getTournaments() {
		return tournaments;
	}
	public void setTournaments(Tournaments tournaments) {
		this.tournaments = tournaments;
	}
	@Override
	public String toString() {
		return "Schedule [stadiumName=" + stadiumName + ", location=" + location + ", dateAndTime=" + dateAndTime
				+ ", teamOneName=" + teamOneName + ", teamTwoName=" + teamTwoName + ", tournaments=" + tournaments
				+ "]";
	}
	
	
	
	

}
