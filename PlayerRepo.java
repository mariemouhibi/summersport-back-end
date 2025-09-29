package com.example.crocojuinspring.summersport.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.crocojuinspring.summersport.models.Player;
@Repository
public interface PlayerRepo extends JpaRepository<Player, Long>{

}
