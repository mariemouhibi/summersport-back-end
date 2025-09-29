package com.example.crocojuinspring.summersport.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Matche {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="MATCH_ID")
	private Long id;
	private String teamOne;
	private String teamTwo;
	private int scoreOne;
	private int scoreTwo;
	private Matche() {
		
	}
	private Matche(String teamOne, String teamTwo, int scoreOne, int scoreTwo) {
		this.teamOne = teamOne;
		this.teamTwo = teamTwo;
		this.scoreOne = scoreOne;
		this.scoreTwo = scoreTwo;
	}
	/**
	 * @return the teamOne
	 */
	public String getTeamOne() {
		return teamOne;
	}
	/**
	 * @param teamOne the teamOne to set
	 */
	public void setTeamOne(String teamOne) {
		this.teamOne = teamOne;
	}
	/**
	 * @return the teamTwo
	 */
	public String getTeamTwo() {
		return teamTwo;
	}
	/**
	 * @param teamTwo the teamTwo to set
	 */
	public void setTeamTwo(String teamTwo) {
		this.teamTwo = teamTwo;
	}
	/**
	 * @return the scoreOne
	 */
	public int getScoreOne() {
		return scoreOne;
	}
	/**
	 * @param scoreOne the scoreOne to set
	 */
	public void setScoreOne(int scoreOne) {
		this.scoreOne = scoreOne;
	}
	/**
	 * @return the scoreTwo
	 */
	public int getScoreTwo() {
		return scoreTwo;
	}
	/**
	 * @param scoreTwo the scoreTwo to set
	 */
	public void setScoreTwo(int scoreTwo) {
		this.scoreTwo = scoreTwo;
	}
	
	
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Matche [teamOne=" + teamOne + ", teamTwo=" + teamTwo + ", scoreOne=" + scoreOne + ", scoreTwo="
				+ scoreTwo + "]";
	}
	
		

}
