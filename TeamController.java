package com.example.crocojuinspring.summersport.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.crocojuinspring.summersport.models.Team;
import com.example.crocojuinspring.summersport.services.TeamService;

@CrossOrigin("*")
@RequestMapping("AllTeams")
@RestController
public class TeamController {

	@Autowired
	private TeamService teamservice;
	@PostMapping
	public Team ajouterunteam(@RequestBody Team T) {
		return teamservice.addteam(T);
		}
	@GetMapping
	public List<Team> recupererALLTeams(){
		return teamservice.getALLteam();
		}
	@GetMapping("/{id}")
	public Team  recupereroneteam (@PathVariable long id) {
	return  teamservice.getTeamById(id);
}
	
	@PutMapping
	public Team editerteam(@RequestBody Team T) {
		return teamservice.updateTeam(T);
	}
	public void supprimerteam(@PathVariable long id) {
		teamservice.deleteTeamById(id);
	}
}