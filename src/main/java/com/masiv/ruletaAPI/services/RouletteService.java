package com.masiv.ruletaAPI.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masiv.ruletaAPI.interfaceServices.IrouletteService;
import com.masiv.ruletaAPI.interfaces.IRoulette;
import com.masiv.ruletaAPI.model.Bet;
import com.masiv.ruletaAPI.model.Roulette;

@Service
public class RouletteService implements IrouletteService {

	@Autowired
	private IRoulette data;

	@Override
	public List<Roulette> toList() {

		return (List<Roulette>) data.findAll();
	}

	@Override
	public Optional<Roulette> findRoulette(int id) {
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
	}

	@Override
	public String toggleRoulette(int id, boolean toggle) {
		// TODO Auto-generated method stub
		Optional<Roulette> roulette = data.findById(id);
		if (roulette.isPresent()) {
			Roulette updatedRoulette = roulette.get();
			updatedRoulette.setOpen(toggle);
			data.save(updatedRoulette);

			return "Roulette " + (toggle ? "opened" : "closed") + " succesfully";
		}

		return "Failed to" + (toggle ? "open" : "close") + " roulette. The roulette doesn't exist";
	}

	@Override
	public List<Bet> listBets(int idRoulette) {
		List<Bet> bets = new ArrayList<Bet>();
		Optional<Roulette> roulette = data.findById(idRoulette);
		if (roulette.isPresent()) {
			Roulette foundRoulette = roulette.get();
			bets = foundRoulette.giveBets();
			return bets;
		}

		return bets;
	}

}
