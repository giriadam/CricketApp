package com.main;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.cricletappservieimpl.MatchServiceImpl;
import com.cricletappservieimpl.TeamServiceImpl;
import com.entity.Team;
import com.entity.Tournaments;

public class TestCricketApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TeamServiceImpl tService=new TeamServiceImpl();
		
		Scanner team1 = new Scanner(System.in);
		Scanner playerInfo1 = new Scanner(System.in);
		
	    System.out.println("## Enter Team1 Name");
	    
	    String teamName1 = team1.nextLine();  // Read user input
	    
	    String [] pNames1 = new String[11];
	    for (int i = 0; i < pNames1.length; i++) {

	        
	        System.out.print("## Enter name of Player" + " " + (i + 1) + " > ");
	        
	        pNames1[i] = playerInfo1.nextLine();
	        if(pNames1[i]==null || pNames1[i]=="" )
	             	i--;
	    }
	    

		Team addTeam= new Team(teamName1,pNames1,new Tournaments("T20_Tournament","Sourav Ganguli Admin") );
		tService.addTeam(addTeam);
		 
		 
		 	Scanner team2 = new Scanner(System.in);
			Scanner playerInfo2 = new Scanner(System.in);
			
		    System.out.println("\n ## Enter Team2 Name");
		    
		    String teamName2 = team1.nextLine();  // Read user input
		     // Output user input
		    String [] pNames2 = new String[11];
		    for (int i = 0; i < pNames2.length; i++) {

		        // To print Enter name of Player 1 change i to (i + 1)
		        System.out.print(" ## 2:Enter name of Player" + " " + (i + 1) + " > ");

		        pNames2[i] = playerInfo2.nextLine();
		        if(pNames2[i]==null || pNames2[i]=="" )
	             	i--;
		    }
		    
			Team addTeam2= new Team(teamName2,pNames2,new Tournaments("T20_Tournament","Sourav Ganguli Admin") );
			tService.addTeam(addTeam2);
			 
			
			
			 
					 
			 //match between team and grouping match
	 
			 MatchServiceImpl match=new MatchServiceImpl();
			 Tournaments tournaments=new Tournaments();
			 tournaments.setTournamentName("T20_Tournament");
			 tournaments.setTournament_Admin_Name("Sourav Ganguli Admin");
			 
			 match.addMatchBetTeam(teamName1,teamName2,tournaments);
			 // get Score
			 int R = 40, B = 3, W = 4;
			 String O="4";
			 Map map=getScore(2,1,0,O,R,B,W,teamName1);
			 
			 
			 System.out.println("TeamName1 is: " + teamName1);
			 System.out.println("player1 :"+Arrays.toString( pNames1));
			 System.out.println("\nTeamName1 is: " + teamName1);
			 System.out.println("\n player1 :"+Arrays.toString( pNames1));
			 System.out.println("\n TeamName2 is: " + teamName2);
			 System.out.println("\n player2 :"+Arrays.toString( pNames2));
			 System.out.println(" Runs :"+map);
			 
			 
	}
	
	
	private static Map getScore(int r, int b, int w,  String O,int R, int B, int W, String teamName1) {
		// TODO Auto-generated method stub
		Map map=new HashMap();
		if(r==1 ||r==2 ||r==3 ||r==4 ||r==6)
		{	
			if(r>0)
			R+=r;
			
			if(b<6)
			{B+=b;
			O= O+"."+B;
			}
			
			if(w>0 && w	<11 && w<=1)
			W+=w;
			
			map.put("Runs", R);
			map.put("Balls", B);
			map.put("Wicket", W);
			map.put("Over", O);
			map.put("teamName1", teamName1);
			return map;
		}
		else{
			map.put("Runs", R);
			map.put("Balls", B);
			map.put("Wicket", W);
			map.put("Over", O);
			map.put("teamName1", teamName1);
		return map;
		
		}
	}

}
