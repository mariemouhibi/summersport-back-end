package com.example.crocojuinspring.summersport.services;

import java.util.List;

import com.example.crocojuinspring.summersport.models.MatchModel;

public interface MatchService {

	
public  MatchModel addMatch(MatchModel m); 
	
public List<MatchModel> getALLMatches();
public MatchModel getMatchById(Long id);
public void deleteMatchById (Long id);
public MatchModel updateMatch(MatchModel m);

}
	
