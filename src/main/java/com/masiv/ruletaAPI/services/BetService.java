package com.masiv.ruletaAPI.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masiv.ruletaAPI.interfaceServices.IbetService;
import com.masiv.ruletaAPI.interfaces.IBet;
import com.masiv.ruletaAPI.model.Bet;
import com.masiv.ruletaAPI.model.Roulette;
import com.masiv.ruletaAPI.model.User;

@Service
public class BetService implements IbetService {

	@Autowired
	private IBet dataBet;
	@Autowired
	private UserService userService;
	@Autowired
	private RouletteService rouletteService;

	@Override
	public List<Bet> toList() {
		return (List<Bet>) dataBet.findAll();
	}
	@Override
	public Bet save(Bet bet, int idUser, int idRoulette) {
		Optional<User> user = userService.findUser(idUser);
		Optional<Roulette> roulette = rouletteService.findRoulette(idRoulette);
		bet.setUser(user.get());
		bet.setRoulette(roulette.get());
		Bet saveBet = dataBet.save(bet);
		
		return saveBet;
	}
}
