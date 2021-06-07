package com.masiv.ruletaAPI.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masiv.ruletaAPI.interfaceServices.IrouletteService;
import com.masiv.ruletaAPI.interfaces.IRoulette;
import com.masiv.ruletaAPI.model.Roulette;

@Service
public class RouletteService implements IrouletteService{

	@Autowired
	private IRoulette data;
	@Override
	public List<Roulette> toList() {
		// TODO Auto-generated method stub
		return (List<Roulette>) data.findAll();
	}
	@Override
	public Optional<Roulette> findRoulette(int id) {
		// TODO Auto-generated method stub
		return data.findById(id);
	}
	@Override
	public int save(Roulette roulette) {
		// TODO Auto-generated method stub
		Roulette saveRoulette = data.save(roulette);
		return saveRoulette.getId();
	}
	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
	}

}
