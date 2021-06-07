package com.masiv.ruletaAPI.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masiv.ruletaAPI.interfaceServices.IbetService;
import com.masiv.ruletaAPI.interfaces.IBet;
import com.masiv.ruletaAPI.model.Bet;

@Service
public class BetService implements IbetService {

	@Autowired
	private IBet data;
	@Override
	public List<Bet> toList() {
		// TODO Auto-generated method stub
		return (List<Bet>) data.findAll();
	}
	@Override
	public Optional<Bet> toListIds(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int save(Bet bet) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
	}
	
}
