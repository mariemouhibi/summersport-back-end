package com.example.crocojuinspring.summersport.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="matches")
public class MatchModel {

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	@Column(name ="MATCH_ID")
private long id;
private String team1;
private String team2;
private int scoreOne;
private int scoretwo;
public MatchModel() {
	super();
	// TODO Auto-generated constructor stub
}
public MatchModel(String team1, String team2, int scoreOne, int scoretwo) {
	super();
	this.team1 = team1;
	this.team2 = team2;
	this.scoreOne = scoreOne;
	this.scoretwo = scoretwo;
}
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getTeam1() {
	return team1;
}
public void setTeam1(String team1) {
	this.team1 = team1;
}
public String getTeam2() {
	return team2;
}
public void setTeam2(String team2) {
	this.team2 = team2;
}
public int getScoreOne() {
	return scoreOne;
}
public void setScoreOne(int scoreOne) {
	this.scoreOne = scoreOne;
}
public int getScoretwo() {
	return scoretwo;
}
public void setScoretwo(int scoretwo) {
	this.scoretwo = scoretwo;
}
@Override
public String toString() {
	return "MatchModel [id=" + id + ", team1=" + team1 + ", team2=" + team2 + ", scoreOne=" + scoreOne + ", scoretwo="
			+ scoretwo + "]";
}




}
