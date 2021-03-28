package com.entity;

public class Tournament_Admin {
	
	private Integer id;
	private String tournament_admin_Name;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTournament_admin_Name() {
		return tournament_admin_Name;
	}
	public void setTournament_admin_Name(String tournament_admin_Name) {
		this.tournament_admin_Name = tournament_admin_Name;
	}
	public Tournament_Admin(Integer id, String tournament_admin_Name) {
		super();
		this.id = id;
		this.tournament_admin_Name = tournament_admin_Name;
	}
	@Override
	public String toString() {
		return "Tournament_Admin [id=" + id + ", tournament_admin_Name=" + tournament_admin_Name + "]";
	}
	
	

}
