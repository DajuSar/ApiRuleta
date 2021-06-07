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
    List<Bet> bets;
    public Roulette() {}
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
		
		return open? "Abierta": "Cerrada";
	}
	public void setOpen(boolean open) {
		this.open = open;
	}
    public boolean isOpen(){
    	
    	return open;
    }
    
}
