package com.masiv.ruletaAPI.interfaceServices;

import java.util.List;
import java.util.Optional;

import com.masiv.ruletaAPI.model.Bet;

public interface IbetService {

	public List<Bet> toList();
	public Optional<Bet> toListIds(int id);
	public int save(Bet bet);
	public void delete(int id);
	
}
