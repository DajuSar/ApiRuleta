package com.masiv.ruletaAPI.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "bet")
public class Bet {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private double amount;
	private int number;
	private short color;
	private double result;
	public Bet() {}
	public Bet(int id, double amount, int number, short color) {
		super();
		this.id = id;
		this.amount = amount;
		this.number = number;
		this.color = color;
	}
	public int getId() {
		
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getBet() {
		if(number > 0) {
			return ""+number;
		}else {
			return color==0? "Negro": "Blanco";
		}
	}
}
