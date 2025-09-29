package com.example.crocojuinspring.summersport.servicesImpls;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.crocojuinspring.summersport.models.Player;
import com.example.crocojuinspring.summersport.repositories.PlayerRepo;
import com.example.crocojuinspring.summersport.services.PlayerService;
@Service
public class PlayerServiceImpl  implements PlayerService{

	
	@Autowired
	private PlayerRepo playerrepo;



	@Override
	public List<Player> getAllPlayer() {
		// TODO Auto-generated method stub
		return playerrepo.findAll();
	}

	@Override
	public Player getPlayerbyId(long Id) {
		// TODO Auto-generated method stub
		Optional<Player> p= playerrepo.findById(Id);
		
		return  p.isPresent()? p.get():null;
	}

	@Override
	public void deletePlayerById(Long id) {
		// TODO Auto-generated method stub
		playerrepo.deleteById(id);
	}

	@Override
	public Player updatePlayer(Player p) {
		// TODO Auto-generated method stub
		return playerrepo.save(p);
	}

	@Override
	public Player addplayer(Player p) {
		// TODO Auto-generated method stub
		return playerrepo.save(p);
	}
}
