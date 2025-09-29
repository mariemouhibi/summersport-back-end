package com.example.crocojuinspring.summersport.servicesImpls;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.crocojuinspring.summersport.models.Team;
import com.example.crocojuinspring.summersport.repositories.TeamRepo;
import com.example.crocojuinspring.summersport.services.TeamService;
@Service
public class TeamServiceimpl implements TeamService {

@Autowired	
private TeamRepo teamrepo;
	@Override
	public Team addteam(Team T) {
		// TODO Auto-generated method stub
		return teamrepo.save(T);
	}

	@Override
	public List<Team> getALLteam() {
		// TODO Auto-generated method stub
		return teamrepo.findAll();
	}

	@Override
	public Team getTeamById(Long id) {
		// TODO Auto-generated method stub
		Optional<Team> T=teamrepo.findById(id);
	
		return T.isPresent()? T.get():null;
	}

	@Override
	public void deleteTeamById(long id) {
		// TODO Auto-generated method stub
		teamrepo.deleteById(id);
	}

	@Override
	public Team updateTeam(Team T) {
		// TODO Auto-generated method stub
		return teamrepo.save(T);
	}

}
