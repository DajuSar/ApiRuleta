package com.masiv.ruletaAPI.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "roulette")
public class Roulette {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private boolean open;
	@OneToMany(mappedBy = "roulette", cascade = CascadeType.ALL)
	private List<Bet> bets;
	public Roulette() {
	}
	public Roulette(int id, boolean open) {
		super();
		this.id = id;
		this.open = open;
	}
	public int getId() {
		
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getOpen() {

		return open ? "Abierta" : "Cerrada";
	}

	public void setOpen(boolean open) {
		this.open = open;
	}
	public boolean isOpen() {
		
		return open;
	}
	public List<Bet> giveBets() {
		calculateResults();
		
		return bets;
	}
	public void setBets(List<Bet> bets) {
		this.bets = bets;
	}
	public void calculateResults() {
		int maxNumber = 36;
		int numberResult = (int) Math.round(Math.random() * (maxNumber));
		boolean color = numberResult % 2 == 0 ? true : false;
		if (!open) {
			for (int i = 0; i < bets.size(); i++) {
				bets.get(i).calculateResult(numberResult, color);
			}
		}
	}
}
