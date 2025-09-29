package com.example.crocojuinspring.summersport.services;

import java.util.List;

import com.example.crocojuinspring.summersport.models.Team;

public interface TeamService {
 
	public Team addteam(Team T);
	public List<Team> getALLteam();
	public Team getTeamById (Long id);
	public  void deleteTeamById(long id);
	public Team updateTeam (Team T);
}
