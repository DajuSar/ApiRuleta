package com.masiv.ruletaAPI.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masiv.ruletaAPI.interfaceServices.IrouletteService;
import com.masiv.ruletaAPI.model.Bet;
import com.masiv.ruletaAPI.model.Roulette;

@RestController
@RequestMapping
public class RouletteController {

	@Autowired
	private IrouletteService rouletteService;

	@GetMapping("/roulettesList")
	public List<Roulette> toListRoulettes() {
		List<Roulette> roulettes = rouletteService.toList();

		return roulettes;
	}

	@PutMapping("/open/{idRoulette}/")
	public String openRoulette(@PathVariable int idRoulette) {

		return rouletteService.toggleRoulette(idRoulette, true);
	}

	@PostMapping("/saveRoulette")
	public int save(@RequestBody Roulette roulette) {

		return rouletteService.save(roulette);
	}

	@PutMapping("/close/{idRoulette}/")
	public List<Bet> closeRoulette(@PathVariable int idRoulette) {
		rouletteService.toggleRoulette(idRoulette, false);
		List<Bet> bets = rouletteService.listBets(idRoulette);

		return bets;
	}
}
