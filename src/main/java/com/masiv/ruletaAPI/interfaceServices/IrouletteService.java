package com.masiv.ruletaAPI.interfaceServices;

import java.util.List;
import java.util.Optional;

import com.masiv.ruletaAPI.model.Roulette;

public interface IrouletteService {
	public List<Roulette> toList();
	public Optional<Roulette> findRoulette(int id);
	public int save(Roulette roulette);
	public void delete(int id);
}
