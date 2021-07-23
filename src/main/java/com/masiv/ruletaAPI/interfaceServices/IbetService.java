package com.masiv.ruletaAPI.interfaceServices;

import java.util.List;

import com.masiv.ruletaAPI.model.Bet;

public interface IbetService {
	public List<Bet> toList();

	public Bet save(Bet bet, int idUser, int idRoulette);
}
