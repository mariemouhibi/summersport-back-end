package com.example.crocojuinspring.summersport.servicesImpls;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.crocojuinspring.summersport.models.MatchModel;
import com.example.crocojuinspring.summersport.repositories.MatchRespository;
import com.example.crocojuinspring.summersport.services.MatchService;
@Service
public class MatchServiceImpl implements MatchService {

	
@Autowired
private MatchRespository matchRepo;
	
@Override
	public MatchModel addMatch(MatchModel m) {
		// TODO Auto-generated method stub
		return matchRepo.save(m);
	}

	@Override
	public List<MatchModel> getALLMatches() {
		// TODO Auto-generated method stub
		return matchRepo.findAll();
	}

	@Override
	public MatchModel getMatchById(Long id) {
		// TODO Auto-generated method stub
		Optional<MatchModel> m = matchRepo.findById(id);
		return m.isPresent() ? m.get() : null;
	}

	@Override
	public void deleteMatchById(Long id) {
		// TODO Auto-generated method stub
		matchRepo.deleteById(id);
	}

	@Override
	public MatchModel updateMatch(MatchModel m) {
		// TODO Auto-generated method stub
		return matchRepo.save(m);
	}

}
