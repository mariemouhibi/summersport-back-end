package com.example.crocojuinspring.summersport.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Players")
public class Player {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="PLAYER_ID")
	private long id;
		private String nom;
		private int number;
		private String position;
		private int age;
		public Player() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Player(String nom, int number, String position, int age) {
			super();
			this.nom = nom;
			this.number = number;
			this.position = position;
			this.age = age;
		}
		
		public long getId() {
			return id;
		}
	
		public String getNom() {
			return nom;
		}
		public void setNom(String nom) {
			this.nom = nom;
		}
		public int getNumber() {
			return number;
		}
		public void setNumber(int number) {
			this.number = number;
		}
		public String getPosition() {
			return position;
		}
		public void setPosition(String position) {
			this.position = position;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		@Override
		public String toString() {
			return "Player [nom=" + nom + ", number=" + number + ", position=" + position + ", age=" + age + "]";
		}
		
		
		
		
}
