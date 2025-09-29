package com.example.crocojuinspring.summersport.services;

import java.util.List;

import com.example.crocojuinspring.summersport.models.Player;

public interface PlayerService {

	public Player addplayer(Player p);
	public List<Player> getAllPlayer();
	public Player getPlayerbyId(long Id);
	public void deletePlayerById (Long id);
	public Player updatePlayer(Player p);
	
}
