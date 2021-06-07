package com.masiv.ruletaAPI.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "bet")
public class Bet {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@ManyToOne
	@JoinColumn(name = "FK_USER", nullable = false, updatable = false)
	private User user;
	@ManyToOne
	@JoinColumn(name = "FK_ROULETTE", nullable = false, updatable = false)
	private Roulette roulette;
	private double amount;
	private int number;
	private boolean color;
	private double result;
	public Bet() {}
	public Bet(int id, User user, Roulette roulette, double amount, int number, boolean color, double result) {
		super();
		this.id = id;
		this.user = user;
		this.roulette = roulette;
		this.amount = amount;
		this.number = number;
		this.color = color;
		this.result = result;
	}
	public int getId() {
		
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public void setRoulette(Roulette roulette) {
		this.roulette = roulette;
	}
	public double getAmount() {
		
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public int getNumber() {
		
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public boolean getColor() {
		
		return color;
	}
	public void setColor(boolean color) {
		this.color = color;
	}
	public double getResult() {
		
		return result;
	}
	public void setResult(double result) {
		this.result = result;
	}
	public void calculateResult(int rouletteNumber, boolean color) {
		result = 0;
		if(number >= 0 && number == rouletteNumber) {
				result = amount*5;
		}else if(this.color == color){
				result = amount*1.8;
		}
	}
}
