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
	private short color;
	private double result;
	public Bet() {}
	public Bet(int id, User user, Roulette roulette, double amount, int number, short color, double result) {
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
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Roulette getRoulette() {
		return roulette;
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
	public short getColor() {
		return color;
	}
	public void setColor(short color) {
		this.color = color;
	}
	public double getResult() {
		return result;
	}
	public void setResult(double result) {
		this.result = result;
	}
}
