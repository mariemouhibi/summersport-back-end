package com.example.crocojuinspring.summersport.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.crocojuinspring.summersport.models.Player;
import com.example.crocojuinspring.summersport.services.PlayerService;

@CrossOrigin("*")
@RequestMapping("allPlayer")
@RestController



public class PlayerController {

@Autowired
	public PlayerService playerservice;


@PostMapping
public Player ajouterpalyer(@RequestBody Player p) {
	return playerservice.addplayer(p);
}

@GetMapping
public List<Player> recupererALLPlayer(){
	return playerservice.getAllPlayer();
	
}

@GetMapping("/{id}")
public Player recupereroneplayer(@PathVariable long id) {
	return playerservice.getPlayerbyId(id);
}
@PutMapping
public Player editerplayer(@RequestBody Player p) {
	return playerservice.updatePlayer(p);
}

@DeleteMapping("/{id}")
public void supprimerplayer(@PathVariable long id) {
	playerservice.deletePlayerById(id);
}
}