package com.example.crocojuinspring.summersport.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Teams")
public class Team {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="TEAM_ID")
private long id;
		 private String name;
		 private String owner;
		 private int fondation;
		 private String stadium;
		public Team() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Team(long id, String name, String owner, int fondation, String stadium) {
			super();
			this.id = id;
			this.name = name;
			this.owner = owner;
			this.fondation = fondation;
			this.stadium = stadium;
		}
		public long getId() {
			return id;
		}
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getOwner() {
			return owner;
		}
		public void setOwner(String owner) {
			this.owner = owner;
		}
		public int getFondation() {
			return fondation;
		}
		public void setFondation(int fondation) {
			this.fondation = fondation;
		}
		public String getStadium() {
			return stadium;
		}
		public void setStadium(String stadium) {
			this.stadium = stadium;
		}
		@Override
		public String toString() {
			return "Team [id=" + id + ", name=" + name + ", owner=" + owner + ", fondation=" + fondation + ", stadium="
					+ stadium + "]";
		}
		 
}
